package E6;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Rectangle rect1 = new Rectangle(100, 50, 100, 100);
        Rectangle rect2 = new Rectangle(50, 30, 150, 20);
        Circle circle1 = new Circle(40, 300, 300);
        Image img1 = new Image(200, 200, "C:\\Users\\dfium\\Downloads\\Immagine4.png");
        //canvas.add(rect2);
        //canvas.add(img1);
        Shape group = new CompositeShape();
        group.add(rect1);
        group.add(circle1);
        canvas.add(group);
        // Simulate drawing the canvas (in a real application, this would be done in a GUI)
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                canvas.draw(g);
            }
        };
        frame.setContentPane(panel);
        frame.setVisible(true);
        
    }
}
