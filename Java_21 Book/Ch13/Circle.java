import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Circle extends JFrame {
    public Circle() {
        super("Circle");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CircPane circo = new CircPane();
        add(circo);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        Circle frame = new Circle();
    }
}

    
class CircPane extends JPanel {
    public void paintComponent(Graphics comp) {
        setSize(300,300);
        // Set variables 

        Graphics2D comp2D = (Graphics2D)comp;
        int CORD_X = 150;
        int CORD_Y = 150;
        int RAD = 200;
        Color C1 = new Color(75, 175, 175);

        // Set color and antialiasing
        comp2D.setColor(C1);
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw circle
        Ellipse2D.Float circ = new Ellipse2D.Float(CORD_X-(RAD/2), CORD_Y-(RAD/2), RAD, RAD);
        comp2D.fill(circ);
        comp2D.draw(circ);
    }
}