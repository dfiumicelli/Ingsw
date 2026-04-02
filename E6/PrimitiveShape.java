package E6;

public abstract class PrimitiveShape implements Shape {
    @Override
    public void add(Shape shape) {
        throw new UnsupportedOperationException("Cannot add shape to a primitive shape.");
    }

    @Override
    public void remove(Shape shape) {
        throw new UnsupportedOperationException("Cannot remove shape from a primitive shape.");
    }

}
