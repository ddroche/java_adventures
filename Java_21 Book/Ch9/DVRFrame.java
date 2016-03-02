import javax.swing.*;

public class DVRFrame extends JFrame {
    JButton play, stop, rewind, fforward, pause;

    public DVRFrame() {
        super("DVR Controls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        //create icons
        ImageIcon playicon = new ImageIcon("play.gif");
        ImageIcon stopicon = new ImageIcon("stop.gif");
        ImageIcon rewindicon = new ImageIcon("rewind.gif");
        ImageIcon fficon = new ImageIcon("ff.gif");
        ImageIcon pauseicon = new ImageIcon("pause.gif");
        //create buttons
        rewind = new JButton(rewindicon);
        play = new JButton(playicon);
        pause = new JButton(pauseicon);
        stop = new JButton(stopicon);
        fforward = new JButton(fficon);
        //add buttons to panel
        panel.add(rewind);
        panel.add(play);
        panel.add(pause);
        panel.add(stop);
        panel.add(fforward);
        //add panel to frame
        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] arguments) {
        DVRFrame dvr = new DVRFrame();
    }
}