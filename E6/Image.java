package E6;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
public class Image extends PrimitiveShape {
    private int x;
    private int y;
    private String path;
    public Image(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.path = path;
    }
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public void draw(Graphics g) {
        try {
            BufferedImage img = javax.imageio.ImageIO.read(new java.io.File(path));
            g.drawImage(img, x, y, null);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
