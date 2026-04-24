package Esami.Appello100120;

public class OperationX implements Operation{
    public void visit(ComponentA c){
        System.out.println("Sto visitando il componente "+c.getCode()+" con temperatura "+c.getTemperature());
    }
    public void visit(ComponentB c){
        System.out.println("Sto visitando il componente "+c.getCode()+" con tensione "+c.getVoltage());
    }
}
