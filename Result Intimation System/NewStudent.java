package Bootathon1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewStudent {
	
	public NewStudent() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame("New Student Registration");
		f.setSize(700, 500);
		
		JLabel l1 = new JLabel("ADD A NEW STUDENT DETAILS");
		l1.setBounds(210, 50, 250, 50);
		l1.setFont(new Font("Arial", Font.BOLD,15));
		f.add(l1);
		
		JLabel roll = new JLabel("ROLL NUMBER");
		roll.setBounds(200, 100, 100, 50);
		f.add(roll);
		
		JTextField rollText = new JTextField();
		rollText.setBounds(350, 115, 100, 25);
		f.add(rollText);
		
		JLabel name = new JLabel("STUDENT NAME");
		name.setBounds(200, 150, 100, 50);
		f.add(name);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(350, 165, 100, 25);
		f.add(nameText);
		
		JLabel dob = new JLabel("DATE OF BIRTH");
		dob.setBounds(200, 200, 100, 50);
		f.add(dob);
		
		JTextField dobText = new JTextField();
		dobText.setBounds(350, 215, 100, 25);
		f.add(dobText);
		
		JButton b = new JButton("ADD");
		b.setBounds(270, 300, 100, 50);
		f.add(b);
		
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Connectivity ob = new Connectivity();
				
				ob.a = rollText.getText();
				ob.b = nameText.getText();
				ob.c = dobText.getText();
				
				ob.insertDetails();
				
				rollText.setText("");
				nameText.setText("");
				dobText.setText("");
			}
		});
		
		f.setLayout(null);
		f.setVisible(true);
	}
	
}
