package Bootathon1;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage {
	AdminPage(){
		JFrame f= new JFrame();
	    f.setSize(700,500);
	    JLabel l1 = new JLabel("ADMIN CONTROL");
	    JLabel l2 = new JLabel("ADMIN : SRI KRISHNA INSTITUTION");
	    l1.setBounds(290, 25, 150, 50);
	    l2.setBounds(230,100,300,40);
//	     f.drawRect(100,15,100,200);
	    l1.setFont(new Font("Arial",Font.BOLD,15));
	    l2.setFont(new Font("Arial",Font.BOLD,15));
	    f.add(l1);
	    f.add(l2);
	    JButton bt1 = new JButton("ADD STUDENT");
	    JButton bt2 = new JButton("UPDATE DETAILS");
	    JButton bt3 = new JButton("ADD MARKS");
	    bt1.setBounds(62,210,150,50);
	    bt2.setBounds(274,210,150,50);
	    bt3.setBounds(486,210,150,50);
	    f.add(bt1);
	    f.add(bt2);
	    f.add(bt3);
	    
	    bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new NewStudent();
			}
		});
	    
	    bt2.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		// TODO Auto-generated method stub
	    		new StudentUpdate();
	    	}
	    });
	    
	    bt3.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		// TODO Auto-generated method stub
	    		new MarkRoll();
	    	}
	    });
	    
	    f.setLayout(null);
	    f.setVisible(true);
	}
	
	public static void main(String[] dag) {
		new AdminPage();
	}

}
