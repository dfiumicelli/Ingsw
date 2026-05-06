package Esami.Appello050220;

public class AndOperator implements Operator{
    private static Operator instance;
    private AndOperator(){
        //privato
    }
    public static Operator getInstance(){
        if(instance==null){
            instance = new AndOperator();
        }
        return instance;
    }
    public boolean getValue(Expression e1, Expression e2){
        return e1.getValue() && e2.getValue();
    }
    public String toString(){
        return "AND";
    }
}
