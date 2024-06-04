package hexlet.code;

import static  org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class StringSchemaTest {

    @Test
    public void stringSchemaTest() {
        var v = new Validator();
        var testSchema = v.string();

        assertTrue(testSchema.isValid(""));
        assertTrue(testSchema.isValid(null));
        assertTrue(testSchema.minLength(1).isValid("dsa"));
        assertTrue(testSchema.minLength(3).isValid("dgs"));
        assertTrue(testSchema.minLength(0).isValid(""));
        assertTrue(testSchema.contains("qwe").isValid("qwer"));
        assertTrue(testSchema.contains("").isValid(""));
        assertTrue(testSchema.required().minLength(10).minLength(1)
                .contains("x").contains("qwe").isValid("qwerty"));

        assertFalse(testSchema.required().isValid(""));
        assertFalse(testSchema.required().isValid(null));
        assertFalse(testSchema.minLength(10).isValid("dsf"));
        assertFalse(testSchema.contains("sf").isValid("saf"));


    }
}
