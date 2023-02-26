package Bootathon1;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MarkRoll {
	public String s;
	MarkRoll(){
		JFrame f = new JFrame("MARK PAGE");
        f.setSize(700,500);
        JLabel l1 = new JLabel("ADD MARKS");
        JLabel l2 = new JLabel("ROLL NO");
        JTextField t1 = new JTextField();
        JButton b = new JButton("ADD");
        l1.setBounds(295,50,200,20);
        l2.setBounds(315,120,80,20);
        t1.setBounds(290,150,120,30);
        b.setBounds(315,200,70,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        l2.setFont(new Font("Arial",Font.BOLD,15));
        b.setFont(new Font("Arial",Font.BOLD,15));
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Marks(t1.getText());
            }
        });
        f.setLayout(null);
        f.setVisible(true);
	}	
	
	public static void main(String[] dfhg) {
		new MarkRoll();
	}
}