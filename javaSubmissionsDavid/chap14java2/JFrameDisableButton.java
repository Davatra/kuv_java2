package chap14java2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JFrameDisableButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Disable Button");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> button.setEnabled(false));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
