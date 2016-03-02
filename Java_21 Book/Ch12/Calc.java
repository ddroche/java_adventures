import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame implements ActionListener {
    JButton plus;
    JButton minus;
    JTextField num1;
    JTextField num2;
    JLabel sol;

    public Calc() {
        super("Plus or Minus");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JPanel pane = new JPanel();
        GridLayout grid = new GridLayout(3,2,10,10);
        pane.setLayout(grid);
        plus = new JButton("+");
        minus = new JButton("-");
        plus.addActionListener(this);
        minus.addActionListener(this);
        num1 = new JTextField();
        num2 = new JTextField();
        sol = new JLabel();
        pane.add(plus);
        pane.add(minus);
        pane.add(num1);
        pane.add(num2);
        pane.add(sol);
        add(pane);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            Object source = evt.getSource();
            if (source == plus) {
                //add logic here
                int total = Integer.parseInt(num1.getText()) +
                    Integer.parseInt(num2.getText());
                sol.setText("" + total);
            } else if (source == minus) {
                //add logic here
                int total = Integer.parseInt(num1.getText()) -
                    Integer.parseInt(num2.getText());
                sol.setText("" + total);
            }
        } catch (NumberFormatException nfe) {
            sol.setText("Error: " + nfe.getMessage());
        }
        repaint();
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.err.println("Couldn't use the system " + "look and feel: " + exc);
        }
    }

    public static void main(String[] arguments) {
        Calc frame = new Calc();
    }



}