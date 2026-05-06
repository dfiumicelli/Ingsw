package Esami.Appello050220;

public class test {
    public static void main(String[] args) {
        Expression t1 = new TrivialExpression(true);
        Expression t2 = new TrivialExpression(false);
        Expression c1 = new CompoundExpression(t1, t2, AndOperator.getInstance());
        Expression c2 = new CompoundExpression(t1, t1, OrOperator.getInstance());
        Expression c3 = new CompoundExpression(c1, c2, AndOperator.getInstance());
        System.out.println(c1.toString() + " = " + c1.getValue());
        System.out.println(c2.toString() + " = " + c2.getValue());
        System.out.println(c3.toString() + " = " + c3.getValue());
    }
}
