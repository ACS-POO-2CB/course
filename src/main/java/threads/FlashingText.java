package threads;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class FlashingText extends JFrame implements Runnable {
    private static final long serialVersionUID = 3846816630271635520L;

    private JLabel jlblText = new JLabel("Welcome to Java OOP", JLabel.CENTER);

    public FlashingText() {
        add(jlblText);
        jlblText.setForeground(Color.RED);
        new Thread(this).start();
    }

    /**
     * Set the text on/off every 200 milliseconds
     */
    public void run() {
        try {
            while (true) {
                if (jlblText.getText() == null)
                    jlblText.setText("This is JAVA!!");
                else
                    jlblText.setText(null);

                Thread.sleep(200);
            }
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new FlashingText();
                frame.setLocationRelativeTo(null); // Center the frame
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200, 200);
                frame.setVisible(true);
            }
        });
    }
}
