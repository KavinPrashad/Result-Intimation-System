package Bootathon1;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentUpdate {
	StudentUpdate(){
		JFrame f = new JFrame("UPDATE PAGE");
        f.setSize(700,500);
        JLabel l1 = new JLabel("UPDATE DETAILS");
        JLabel l2 = new JLabel("ROLL NO");
        JTextField t1 = new JTextField();
        JButton add = new JButton("UPDATE");
        JButton delete = new JButton("DELETE");
        l1.setBounds(265,50,200,20);
        l2.setBounds(315,120,80,20);
        t1.setBounds(290,150,120,30);
        add.setBounds(250,200,110,30);
        delete.setBounds(370,200,100,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        l2.setFont(new Font("Arial",Font.BOLD,15));
        add.setFont(new Font("Arial",Font.BOLD,15));
        delete.setFont(new Font("Arial",Font.BOLD,15));
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(add);
        f.add(delete);
        
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	new UdpateDetails(t1.getText());                
            }
        });
        
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Connectivity ob = new Connectivity();
                ob.a=t1.getText();
                ob.delete();
            }
        });
        
        f.setLayout(null);
        f.setVisible(true);
	}
}
