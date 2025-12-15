package chap14java2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Favorite Book Quote");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String quote = "A beginning is the time for taking the most delicate care that the balances are correct. - Dune, Frank Herbert";
		JLabel label = new JLabel(quote);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		frame.add(label);
		frame.setSize(700, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	

	}

}
