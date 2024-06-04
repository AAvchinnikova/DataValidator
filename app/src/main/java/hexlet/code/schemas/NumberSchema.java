package hexlet.code.schemas;

import java.util.Objects;

public class NumberSchema extends BaseSchema {

    public NumberSchema required() {
        super.addCheck("required",
                Objects::nonNull);
        return this;
    }
    public NumberSchema positive() {
        super.addCheck("positive",
                value -> value instanceof Integer && ((Integer) value) > 0);
        return this;
    }
    public  NumberSchema range(int minNumber, int maxNumber) {
        super.addCheck("range",
                value -> ((Integer) value) >= minNumber && ((Integer) value) <= maxNumber);
        return this;
    }

}
