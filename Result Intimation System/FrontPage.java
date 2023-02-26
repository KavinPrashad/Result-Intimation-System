package Bootathon1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

class MyProject{
	public MyProject() {
		JFrame f = new JFrame("SKCET");
		f.setSize(700, 500);
		
		JLabel title = new JLabel("SRI KRISHNA COLLEGE OF ENGINEERING");
		title.setBounds(125, 70, 450, 50);
		title.setFont(new Font("Arial", Font.BOLD, 20));
		f.add(title);
		
		JLabel title1 = new JLabel("AND TECHNOLOGY");
		title1.setBounds(220, 100, 450, 50);
		title1.setFont(new Font("Arial", Font.BOLD, 20));
		f.add(title1);
		
		JButton student = new JButton("STUDENT LOGIN");
		student.setBounds(240, 200, 150, 30);
		f.add(student);
		
		JButton admin = new JButton("ADMIN LOGIN");
		admin.setBounds(240, 250, 150, 30);
		f.add(admin);
		
		admin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminLog();
			}
		});
		
		student.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserLog();
			}
		});

		
		f.setLayout(null);
		f.setVisible(true);
	}
}

public class FrontPage {
	public static void main(String[] ksdgh) {
		new MyProject();
	}
}
