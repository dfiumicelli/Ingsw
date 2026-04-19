package Esami.Appello201219;

public class LongWrapper extends Wrapper {

    private long value;

    public LongWrapper(long value) {
        this.value = value;
    }

    @Override
    public Wrapper doDuplicate() {
        return new LongWrapper(value);
    }

    public long getValue() {
        return value;
    }
    
     public void setValue(long value) {
        this.value = value;
    }

}
