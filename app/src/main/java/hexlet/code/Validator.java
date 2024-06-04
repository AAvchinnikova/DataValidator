package hexlet.code;

import hexlet.code.schemas.StringSchema;

public final class Validator {

    public final StringSchema string() {
        return new StringSchema();
    }
}
