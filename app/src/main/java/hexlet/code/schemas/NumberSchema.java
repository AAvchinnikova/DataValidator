package hexlet.code.schemas;

import java.util.Objects;

public final class NumberSchema extends BaseSchema<Integer> {

    public NumberSchema required() {
        super.addCheck("required",
                Objects::nonNull);
        return this;
    }
    public NumberSchema positive() {
        super.addCheck("positive",
                value -> value == null || ((Integer) value) > 0);
        return this;
    }
    public  NumberSchema range(int minNumber, int maxNumber) {
        super.addCheck("range",
                value -> value != null
                        && ((Integer) value) >= minNumber && ((Integer) value) <= maxNumber);
        return this;
    }

}
