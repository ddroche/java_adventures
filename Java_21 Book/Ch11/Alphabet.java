import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alphabet extends JFrame {

    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        FlowLayout flo = new FlowLayout(FlowLayout.CENTER, 30, 10); //extra variables are horizontal gap and vertical gap in pixels
        setLayout(flo);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Burglar");
        JButton c = new JButton("Corpse");
        JButton d = new JButton("Deadbeat");
        JButton e = new JButton("Evidence");
        JButton f = new JButton("Fugitive");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system " + "look and feel: " + e);
        }
    }

    public static void main(String[] arguments) {
        Alphabet frame = new Alphabet();
    }
}