package Esami.Appello201219;
import java.util.ArrayList;

public abstract class Wrapper {
	private ArrayList<Wrapper> children = new ArrayList<Wrapper>();
    public void addChild(Wrapper w) {
        children.add(w);
    }
    public ArrayList<Wrapper> getChildren() {
        return children;
    }
    public Wrapper duplicate() {
        Wrapper copy = doDuplicate();
        for (Wrapper child : children) {
            copy.addChild(child.duplicate());
        }
        return copy;
    }
    public abstract Wrapper doDuplicate();
}
