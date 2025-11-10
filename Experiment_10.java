package oopsRecordPrograms_3rdSem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Experiment_10 extends JFrame implements ActionListener {

    // Components
    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    // Constructor
    Experiment_10() {
        setTitle("Swing Application");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        lblUser = new JLabel("Username");
        lblUser.setBounds(80, 50, 100, 25);
        add(lblUser);

        lblPass = new JLabel("Password");
        lblPass.setBounds(80, 90, 100, 25);
        add(lblPass);

        // Text fields
        txtUser = new JTextField();
        txtUser.setBounds(180, 50, 120, 25);
        add(txtUser);

        txtPass = new JPasswordField();
        txtPass.setBounds(180, 90, 120, 25);
        add(txtPass);

        // Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 130, 80, 30);
        add(btnLogin);

        // Button action
        btnLogin.addActionListener(this);

        // Center the window
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        String username = txtUser.getText();
        String password = new String(txtPass.getPassword());

        if (username.equals("Karunya") && password.equals("Karunya")) {
            JOptionPane.showMessageDialog(this, "Login Successful", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new Experiment_10();
    }
}

