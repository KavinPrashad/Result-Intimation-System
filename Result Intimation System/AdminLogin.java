package Bootathon1;

import java.awt.*;
import javax.swing.*;

public class AdminLogin{
    public static void mypage(){
        JFrame f = new JFrame();
        f.setSize(700, 500);
        JLabel l = new JLabel("Adminstator Login");
        JLabel l1 = new JLabel("User Name : ");
        JLabel l2 = new JLabel("Password  : ");
        JTextField t1 = new JTextField();
        JPasswordField t2 = new JPasswordField();
        l.setBounds(280, 70, 220, 30);
        l1.setBounds(210, 110, 100, 30);
        t1.setBounds(300, 110, 100, 30);
        l2.setBounds(210, 160, 100, 30);
        t2.setBounds(300, 160, 100, 30);
        l.setFont(new Font("Arial",Font.BOLD,15));
        f.add(l);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        JButton b = new JButton("Login");
        b.setBounds(250, 210, 100, 30);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
       new AdminLogin().mypage(); 
    }
}
