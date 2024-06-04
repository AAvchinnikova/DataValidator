package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema {

    public MapSchema required() {
        super.addCheck("required",
                value -> value instanceof Map<?, ?>);
        return this;
    }
    public MapSchema sizeof(int size) {
        super.addCheck("sizeof",
                value -> ((Map<?, ?>) value).size() == size);
        return this;
    }
    public MapSchema shape(Map<String, BaseSchema> schemas) {
        super.addCheck("shape",
                value -> schemas.entrySet().stream().allMatch(item -> {
                    Object object = ((Map<?, ?>) value).get(item.getKey());
                    return item.getValue().isValid(object);
                })
        );
        return this;
    }
}
