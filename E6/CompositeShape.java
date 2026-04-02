package E6;

public class CompositeShape implements Shape {
    private java.util.List<Shape> shapes;

    public CompositeShape() {
        this.shapes = new java.util.ArrayList<>();
    }

    @Override
    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void move(int dx, int dy) {
        for (Shape shape : shapes) {
            shape.move(dx, dy);
        }
    }

    @Override
    public void draw(java.awt.Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    
}
