package Esami.Appello050220;

public class OrOperator implements Operator{
    private static Operator instance;
    private OrOperator(){
        //private
    }
    public static Operator getInstance(){
        if(instance==null)
            instance=new OrOperator();
        return instance;
    }
    public boolean getValue(Expression e1, Expression e2){
        return e1.getValue() || e2.getValue();
    }
    public String toString(){
        return "OR";
    }
}
