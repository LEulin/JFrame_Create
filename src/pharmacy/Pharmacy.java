/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author eulinle_sd2022
 */
public class Pharmacy extends JFrame {

    private JButton button1;
    private JPanel f;
    private JLabel l;
    private JTextField t;
    private JLabel uname;
    private JLabel pass;
    private JTextField t1;
    private JTextField t2;

    public Pharmacy() {
        button1 = new JButton();
        f = new JPanel();
        l = new JLabel();
        uname = new JLabel();
        pass = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        
        this.setLayout(null);
        this.setVisible(true);
        //this.setBorder(BorderFactory.createLineBorder(Color.yellow)));
        this.setSize(500, 500);

//        l.setText("LOGIN");
//        l.setLocation(30, 30);
//        l.setSize(200, 200);
//        l.setVisible(true);

        uname.setText("Username:");
        t1 = new JTextField(20);

        
        pass.setText("Password:");
        t2 = new JTextField(20);

        
        
        uname.setLocation(10,30);
        t1.setLocation(10, 30);
        pass.setLocation(30,60);
        t2.setLocation(30, 60);
        
        
        button1.setText("LOGIN");
        button1.setLocation(20,20);
        button1.setSize(200,200);
        button1.setVisible(true);
        button1.addActionListener((ActionEvent e) -> {
            System.out.println("You are Succesfully Logged-in!");
            System.out.println("Welcome to the Pharmacy");
        });
//       f.setLayout(new BoxLayout(f, BoxLayout.PAGE_AXIS));       
        f.setVisible(true);
        f.setSize(500, 500);
        f.add(t1);
        f.add(t2);
        f.add(button1);
//        f.add(l);
        this.add(f);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pharmacy m = new Pharmacy();
    }

    private void setBorder(Border createLineBorder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
