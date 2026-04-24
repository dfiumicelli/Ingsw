package Esami.Appello100120;

public class ComponentB implements Component{
    private String code;
    private long voltage;
    public ComponentB(String code){
        this.code=code;
    }
    public String getCode() {
        return code;
    }
    public long getVoltage() {
        return voltage;
    }
    public void setVoltage(long voltage) {
        this.voltage = voltage;
    }
    public void accept(Operation o){
        o.visit(this);
    }
}
