package hexlet.code;

import hexlet.code.schemas.BaseSchema;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static  org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assertions.assertFalse;

public class MapSchemaTest {

    @Test
    public void mapSchemaTest() {
        var v = new Validator();
        var testSchema = v.map();

        assertTrue(testSchema.isValid(null));
        assertFalse(testSchema.required().isValid(null));
        assertTrue(testSchema.isValid(new HashMap<>()));

        var data = new HashMap<String, String>();
        data.put("key1", "value1");

        assertTrue(testSchema.isValid(data));
        assertFalse(testSchema.sizeof(2).isValid(data));

        data.put("key2", "value2");

        assertTrue(testSchema.isValid(data));

        var data2 = new Validator();
        var testSchema2 = data2.map();

        Map<String, BaseSchema> schemas = new HashMap<>();
        schemas.put("firstName", data2.string().required());
        schemas.put("lastName", data2.string().required().minLength(2));

        testSchema2.shape(schemas);

        Map<String, String> human1 = new HashMap<>();
        human1.put("firstName", "Josh");
        human1.put("lastName", "Smith");
        assertTrue(testSchema2.isValid(human1));

        Map<String, String> human2 = new HashMap<>();
        human1.put("firstName", "Josh");
        human1.put("lastName", null);
        assertFalse(testSchema2.isValid(human2));

        Map<String, String> human3 = new HashMap<>();
        human1.put("firstName", "Anna");
        human1.put("lastName", "B");
        assertFalse(testSchema2.isValid(human3));

    }
}
