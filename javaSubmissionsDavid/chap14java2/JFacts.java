package chap14java2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFacts {

    private static int index = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Astronomy Facts");
        JPanel panel = new JPanel();

        JLabel[] facts = {
            new JLabel("The Sun is a star."),
            new JLabel("Light takes 8 minutes to reach Earth."),
            new JLabel("Jupiter is the largest planet."),
            new JLabel("Saturn has visible rings."),
            new JLabel("The Milky Way is a galaxy."),
            new JLabel("Black holes bend space and time.")
        };

        JButton button = new JButton("Next Fact");

        panel.add(facts[0]);

        button.addActionListener(e -> {
            panel.remove(facts[index]);
            index = (index + 1) % facts.length;
            panel.add(facts[index]);
            panel.revalidate();
            panel.repaint();
        });

        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
