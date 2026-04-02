package E6;

public interface Shape {
    void add(Shape shape);
    void remove(Shape shape);
    void move(int dx, int dy);
    void draw(java.awt.Graphics g);
}
