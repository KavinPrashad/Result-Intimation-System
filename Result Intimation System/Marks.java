package Bootathon1;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marks {
	Marks(String st){
		JFrame f = new JFrame("DATA ENTER");
        JLabel l1 = new JLabel("ENTER MARKS");
        JLabel l2 = new JLabel("SUB 1");
        JLabel l3 = new JLabel("SUB 2");
        JLabel l4 = new JLabel("SUB 3");
        JButton b = new JButton("SUBMIT");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        f.setSize(700,500);
        l1.setBounds(260,40,200,20);
        l2.setBounds(200,100,50,20);
        l3.setBounds(200,160,50,20);
        l4.setBounds(200,220,50,20);
        b.setBounds(300,300,100,20);
        t1.setBounds(300,100,100,30);
        t2.setBounds(300,160,100,30);
        t3.setBounds(300,220,100,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        l2.setFont(new Font("Arial",Font.BOLD,15));
        l3.setFont(new Font("Arial",Font.BOLD,15));
        l4.setFont(new Font("Arial",Font.BOLD,15));
        b.setFont(new Font("Arial",Font.BOLD,15));
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Connectivity ob = new Connectivity();
                ob.a = t1.getText();
                ob.b = t2.getText();
                ob.c = t3.getText();
                ob.d = st;
                ob.insertMarks();
            }
        });
        
        f.setLayout(null);
        f.setVisible(true);
	}
	
	public static void main(String[] kfuug) {
		new Marks("f");
	}
}
