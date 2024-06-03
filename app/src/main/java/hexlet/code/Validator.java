package hexlet.code;

public final class Validator {

    public void string() {
        var value = new StringSchema();
        var result = value.required();
        System.out.println(result);
    }
}
