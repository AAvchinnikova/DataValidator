package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class StringSchema {

    private boolean allFieldRequired = false;
    private int minLength;
    private boolean statusOfMinLength = false;
    private String substring;
    private boolean statusOfSubstring = false;

    public StringSchema required() {
        this.allFieldRequired = true;
        return this;
    }
    public  StringSchema minLength(int length) {
        this.minLength = length;
        this.statusOfMinLength = true;
        return this;
    }
    public StringSchema contains(String substring) {
        this.substring = substring;
        this.statusOfSubstring = true;
        return this;
    }

    public boolean isValid(Object objectForCheck) {
        List<String> result = new ArrayList<>();

        if (!(objectForCheck instanceof String) && (objectForCheck != null)) {
            return false;
        }
    }

    public boolean required(Object objectForCheck) {
        if (objectForCheck.equals(null)) {
            return false;
        }
        return true;
    }
    public  boolean minLength(Object objectForCheck) {

    }
}
