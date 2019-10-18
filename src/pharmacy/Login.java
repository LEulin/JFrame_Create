/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pharmacy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author eulinle_sd2022
 */
public class Login extends JFrame{
     JPanel panel;
     JLabel user_label, password_label, message;
    JTextField userName;
    JPasswordField password;
    JButton submit;
    
    public Login() {
         // Username
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName = new JTextField();
        
        // Password
        password_label = new JLabel();
        password_label.setText("Password :");
        password = new JPasswordField();
        
        submit = new JButton("LOGIN");
        submit.setSize(10,20);

        panel = new JPanel(new GridLayout(10, 5));
        
        panel.add(user_label);
        panel.add(userName);
        panel.add(password_label);
        panel.add(password);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        submit.addActionListener((ActionEvent e) -> {
            System.out.println("You are Succesfully Logged-in!");
            System.out.println("Welcome to the Pharmacy");
        });
        

        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(400, 400);
        setVisible(true);
        
    }
    
        public static void main(String[] args) {
        new Login();
    }


}
