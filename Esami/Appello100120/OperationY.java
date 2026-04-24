package Esami.Appello100120;

public class OperationY implements Operation{
    public void visit(ComponentA c){
        c.setTemperature(10);
        System.out.println("Ho settato la temperatura a "+c.getTemperature());
    }
    public void visit(ComponentB c){
        c.setVoltage(25);
        System.out.println("Ho settato il voltaggio a "+c.getVoltage());
    }
}
