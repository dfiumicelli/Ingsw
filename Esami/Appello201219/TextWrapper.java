package Esami.Appello201219;
public class TextWrapper extends Wrapper {

    private String value;

    public TextWrapper(String value) {
        this.value = value;
    }

    @Override
    public Wrapper doDuplicate() {
        return new TextWrapper(value);
    }

    public String getText() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
