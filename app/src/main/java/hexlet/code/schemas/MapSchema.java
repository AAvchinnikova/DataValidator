package hexlet.code.schemas;

import java.util.Map;
import java.util.Objects;

public final class MapSchema<K, V> extends BaseSchema<Map<K, V>> {

    public MapSchema<K, V> required() {
        super.addCheck("required",
                Objects::nonNull);
        return this;
    }
    public MapSchema<K, V> sizeof(int size) {
        super.addCheck("sizeof",
                value -> ((Map<?, ?>) value).size() == size);
        return this;
    }
    public MapSchema<K, V> shape(Map<K, BaseSchema<V>> schemas) {
        super.addCheck("shape",
                value -> schemas.entrySet().stream().allMatch(item -> {
                    Object object = ((Map<?, ?>) value).get(item.getKey());
                    return item.getValue().isValid(object);
                })
        );
        return this;
    }
}
