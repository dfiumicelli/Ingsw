package Esami.Appello050220;

public class CompoundExpression implements Expression{
    private Expression e1;
    private Expression e2;
    private Operator op;
    public CompoundExpression(Expression ex1, Expression ex2, Operator op){
        this.e1 = ex1;
        this.e2 = ex2;
        this.op = op;
    }
    public boolean getValue(){
        return op.getValue(e1, e2);
    }
    public String toString(){
        String S="";
        return S+"("+e1.toString()+" "+op.toString()+" "+e2.toString()+")";
    }
}
