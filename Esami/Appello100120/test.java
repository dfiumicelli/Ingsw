package Esami.Appello100120;

public class test {
    public static void main(String[] args) {
        ComponentA c1=new ComponentA("A1");
        ComponentB c2=new ComponentB("B1");
        OperationX o1=new OperationX();
        OperationY o2=new OperationY();
        c1.accept(o1);
        c2.accept(o1);
        c1.accept(o2);
        c2.accept(o2);
    }
}
