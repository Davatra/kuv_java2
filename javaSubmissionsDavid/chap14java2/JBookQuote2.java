package chap14java2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 {
    public static void main(String[] args) {
        
    	JFrame frame = new JFrame("Favorite Book Quote");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	//flow layout
        frame.setLayout(new FlowLayout());

        // quote
        String quoteText = "A beginning is the time for taking the most delicate care that the balances are correct.";
        JLabel quoteLabel = new JLabel(quoteText);

        // button
        JButton button = new JButton("Click for Book Title");

        // empty title lable
        JLabel titleLabel = new JLabel("");

        // action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleLabel.setText("	Dune - Frank Herbert");
            }
        });

        frame.add(quoteLabel);
        frame.add(button);
        frame.add(titleLabel);

        frame.setSize(650, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}