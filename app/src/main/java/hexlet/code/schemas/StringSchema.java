package hexlet.code.schemas;

public class StringSchema extends BaseSchema<String> {

    public StringSchema required() {
        super.addCheck("required",
                value -> value != null && !((String) value).isEmpty());
        return this;
    }
    public StringSchema minLength(int minLength) {
        super.addCheck("minLength",
                value -> value instanceof String && ((String) value).length() >= minLength);
        return this;
    }
    public StringSchema contains(String substring) {
        super.addCheck("contains",
                value -> value instanceof String && ((String) value).contains(substring));
        return this;
    }
}
