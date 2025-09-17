package Practice.Swing.prob1;

import javax.swing.*;
import java.awt.BorderLayout;

public class ShowNameOnClick {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create window
            JFrame frame = new JFrame("Show Name Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            // Create label (empty at first)
            JLabel label = new JLabel("", SwingConstants.CENTER);

            // Create button
            JButton button = new JButton("Show My Name");

            // Button click event
            button.addActionListener(e -> {
                label.setText("Devendra Yadav"); // set your name
            });

            // Add button and label to frame
            frame.setLayout(new BorderLayout());
            frame.add(button, BorderLayout.NORTH);
            frame.add(label, BorderLayout.CENTER);

            // Show the window
            frame.setVisible(true);
        });
    }
}

