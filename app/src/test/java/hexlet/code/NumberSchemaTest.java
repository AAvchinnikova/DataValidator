package hexlet.code;

import static  org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;


public class NumberSchemaTest {

    @Test
    public void numberSchemaTest() {
        var v = new Validator();
        var testSchema = v.number();

        assertTrue(testSchema.isValid(5));
        assertTrue(testSchema.isValid(null));
        assertFalse(testSchema.required().isValid(null));
        assertTrue(testSchema.required().isValid(5));
        assertTrue(testSchema.positive().isValid(5));
        assertFalse(testSchema.positive().isValid(0));
        assertFalse(testSchema.positive().isValid(-5));

        var v2 = new Validator();
        var testSchema2 = v2.number();

        assertTrue(testSchema2.range(1, 10).isValid(4));
        assertTrue(testSchema2.range(0, 5).isValid(0));
        assertTrue(testSchema2.range(0, 5).isValid(5));
        assertFalse(testSchema2.range(5, 10).isValid(3));
        assertFalse(testSchema2.range(5, 10).isValid(15));
        assertTrue(testSchema2.required().positive().range(0, 4).
                range(15, 20).isValid(17));

        var v3 = new Validator();
        var testSchema3 = v3.number();

        assertTrue(testSchema3.range(-15, 0).isValid(-4));


    }
}
