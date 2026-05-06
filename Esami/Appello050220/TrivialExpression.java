package Esami.Appello050220;

public class TrivialExpression implements Expression{
    private boolean value;
    public TrivialExpression(boolean value){
        this.value=value;
    }
    public boolean getValue() {
        return value;
    }
    public String toString(){
        String S="";
        return S+value;
    }
}
