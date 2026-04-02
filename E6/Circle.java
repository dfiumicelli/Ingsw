package E6;
import java.awt.Graphics;
public class Circle extends PrimitiveShape {
    private int radius;
    private int cx;
    private int cy;
    public Circle(int radius, int cx, int cy) {
        this.radius = radius;
        this.cx = cx;
        this.cy = cy;
    }
    public void move(int dx, int dy) {
        this.cx += dx;
        this.cy += dy;
    }
    public void draw(Graphics g) {
        g.drawOval(cx - radius, cy - radius, 2 * radius, 2 * radius);
    }

}
