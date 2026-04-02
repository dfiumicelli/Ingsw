package E6;
import java.awt.Graphics;
public class Rectangle extends PrimitiveShape {
    private int width;
    private int height;
    private int x;
    private int y;


    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}