package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public abstract class BaseSchema<T> {

    private final Map<String, Predicate<Object>> rulesOfCheck = new HashMap<>();

    protected void addCheck(String typeOfCheck, Predicate<Object> predicate) {
        this.rulesOfCheck.put(typeOfCheck, predicate);
    }

    public boolean isValid(Object object) {
        return rulesOfCheck.values().stream().allMatch(predicate -> predicate.test(object));
    }
}
