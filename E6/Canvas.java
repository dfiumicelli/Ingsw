package E6;

public class Canvas extends CompositeShape {
    public Canvas() {
        super();
    }
    public void move(Shape shape, int dx, int dy) {
        shape.move(dx, dy);
    }
}
