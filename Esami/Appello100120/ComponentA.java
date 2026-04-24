package Esami.Appello100120;

public class ComponentA implements Component{
    private String code;
    private long temperature;
    public ComponentA(String code){
        this.code=code;
    }
    public String getCode() {
        return code;
    }
    public long getTemperature() {
        return temperature;
    }
    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }
    public void accept(Operation o){
        o.visit(this);
    }
}
