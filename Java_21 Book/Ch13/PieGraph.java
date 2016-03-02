import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PieGraph extends JFrame {
    public PieGraph() {
        super("Pie Graph");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PiePanel piepanel = new PiePanel();
        add(piepanel);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        PieGraph frame = new PieGraph();
    }
}

class PiePanel extends JPanel {
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D)comp;
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Section 1
        Color c1 = new Color(75,175,175);
        comp2D.setColor(c1);
        Arc2D.Float sec1 = new Arc2D.Float(100f, 100f, 300f, 300f, 0f, 110f, Arc2D.PIE);
        comp2D.fill(sec1);

        // Section 2
        Color c2 = new Color(175,75,175);
        comp2D.setColor(c2);
        Arc2D.Float sec2 = new Arc2D.Float(100f, 100f, 300f, 300f, 110f, (235f-110f), Arc2D.PIE);
        comp2D.fill(sec2);

        // Section 3
        Color c3 = new Color(175,175,75);
        comp2D.setColor(c3);
        Arc2D.Float sec3 = new Arc2D.Float(100f, 100f, 300f, 300f, 235f, (360f-235f), Arc2D.PIE);
        comp2D.fill(sec3);

    }
}