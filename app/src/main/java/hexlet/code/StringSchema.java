package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class StringSchema{

    private boolean statusOfRequired = false;
    private int minLength;
    private boolean statusOfMinLength = false;
    private String substring;
    private boolean statusOfSubstring = false;


    public StringSchema required() {
        this.statusOfRequired = true;
        return this;
    }
    public StringSchema minLength(int minLength) {
        this.minLength = minLength;
        this.statusOfMinLength = true;
        return this;
    }
    public StringSchema contains(String subString) {
        this.substring = subString;
        this.statusOfSubstring = true;
        return this;
    }
    public boolean isValid(String value) {
        List<Boolean> resultCheck = new ArrayList<>();
        if (value == null) {
            value = "";
        }
        if( statusOfRequired) {
            resultCheck.add(checkRequired(value));
        }
        if (statusOfMinLength) {
            resultCheck.add(checkMinLength(value));
        }
        if (statusOfSubstring) {
            resultCheck.add(checkContains(value));
        }
        return !resultCheck.contains(false);
    }

    private boolean checkRequired(String value) {
        return !value.equals("");
    }
    private boolean checkMinLength(String value) {
        return value.length() < minLength;
    }
    private boolean checkContains(String value) {
        return value.contains(substring);
    }

}
