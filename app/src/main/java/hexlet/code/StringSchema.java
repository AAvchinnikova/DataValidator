package hexlet.code;

public class StringSchema {

    private boolean allFieldRequired = false;
    private int minLength;
    private boolean statusOfMinLength = false;
    private String substring;
    private boolean statusOfSubstring = false;
    private String value;


    public StringSchema required() {
        this.allFieldRequired = true;
        return this;
    }

}
