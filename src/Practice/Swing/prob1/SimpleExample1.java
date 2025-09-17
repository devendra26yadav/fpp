package Practice.Swing.prob1;

import javax.swing.*;

public class SimpleExample1 {
    public static void main(String[] args) {
        // Run GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Create a window
            JFrame frame = new JFrame("Simple Swing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null); // center on screen

            // Create a button
            JButton button = new JButton("Click Me");

            // Add action (event) to button
            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Hello, you clicked the button!");
            });

            // Add button to the frame
            frame.add(button);

            // Make it visible
            frame.setVisible(true);
        });
    }
}
