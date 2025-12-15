package chap14java2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDisableButton2 {

    private static int clicks = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Disable Button");
        JPanel panel = new JPanel();

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("");

        button.addActionListener(e -> {
            clicks++;
            if (clicks >= 8) {
                button.setEnabled(false);
                label.setText("That’s enough!");
            }
        });

        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
