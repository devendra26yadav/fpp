package Practice.Swing.prob1;

import javax.swing.*;

public class PrintName {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a window
            JFrame frame = new JFrame("My Name");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            // Label to show your name
            JLabel label = new JLabel("Devendra Yadav", SwingConstants.CENTER);

            // Add label to frame
            frame.add(label);

            // Show the window
            frame.setVisible(true);
        });
    }
}
