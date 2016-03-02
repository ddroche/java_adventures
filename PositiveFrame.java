import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PositiveFrame extends JFrame implements FocusListener {
    JTextField posValue;
    JLabel posField;

    public PositiveFrame() {
        super("Positive Numbers Only");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);

        posValue = new JTextField("", 10);
        posField = new JLabel("Enter a negative number");

        posValue.addFocusListener(this);

        add(posField);
        add(posValue);

        setVisible(true);
    }

    public void focusGained(FocusEvent event) {
        try {
            int val = Integer.parseInt(posValue.getText());
            if (val < 0) {
                val *= -1;
                posValue.setText("" + val);
            }
        } catch (NumberFormatException nfe) {
            posValue.setText("0");
        }
    }

    public void focusLost(FocusEvent event) {
        focusGained(event);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }

    public static void main(String[] arguments) {
        PositiveFrame posFrame = new PositiveFrame();
    }
}