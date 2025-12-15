package chap14java2;

import javax.swing.*;
import java.awt.event.*;

public class JVacationRental {

    private static int price = 600;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Lambert's Vacation Rentals");
        JPanel panel = new JPanel();

        JLabel totalLabel = new JLabel("Total Price: $600");

        // Location buttons
        JRadioButton park = new JRadioButton("Parkside ($600)", true);
        JRadioButton pool = new JRadioButton("Poolside ($750)");
        JRadioButton lake = new JRadioButton("Lakeside ($825)");

        ButtonGroup locationGroup = new ButtonGroup();
        locationGroup.add(park);
        locationGroup.add(pool);
        locationGroup.add(lake);

        // Bedroom buttons
        JRadioButton oneBed = new JRadioButton("1 Bedroom", true);
        JRadioButton twoBed = new JRadioButton("2 Bedrooms");
        JRadioButton threeBed = new JRadioButton("3 Bedrooms");

        ButtonGroup bedGroup = new ButtonGroup();
        bedGroup.add(oneBed);
        bedGroup.add(twoBed);
        bedGroup.add(threeBed);

        // Meals checkbox
        JCheckBox meals = new JCheckBox("Meals Included (+$200)");

        ActionListener updatePrice = e -> {
            price = 0;

            if (park.isSelected()) price = 600;
            if (pool.isSelected()) price = 750;
            if (lake.isSelected()) price = 825;

            if (twoBed.isSelected()) price += 75;
            if (threeBed.isSelected()) price += 150;

            if (meals.isSelected()) price += 200;

            totalLabel.setText("Total Price: $" + price);
        };

        park.addActionListener(updatePrice);
        pool.addActionListener(updatePrice);
        lake.addActionListener(updatePrice);
        oneBed.addActionListener(updatePrice);
        twoBed.addActionListener(updatePrice);
        threeBed.addActionListener(updatePrice);
        meals.addActionListener(updatePrice);

        panel.add(new JLabel("Location"));
        panel.add(park);
        panel.add(pool);
        panel.add(lake);

        panel.add(new JLabel("Bedrooms"));
        panel.add(oneBed);
        panel.add(twoBed);
        panel.add(threeBed);

        panel.add(meals);
        panel.add(totalLabel);

        frame.add(panel);
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

