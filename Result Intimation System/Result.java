package Bootathon1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Result implements ActionListener {
	
	JFrame frame1;//creating object of first JFrame
    JLabel nameLabel;//creating object of JLabel
    JLabel passLabel;
    JTextField nameTextField;//creating object of JTextfield
    JButton fetchButton;//creating object of JButton
    JButton resetButton;//creating object of JButton
   
    JFrame frame2;//creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    Connection connection;//Creating object of Connection class
    Statement statement;//Creating object of Statement class
    int flag=0;
    
	Result(){
		frame1 = new JFrame();
        frame1.setTitle("Search Database");//setting the title of first JFrame
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting default close operation
        GridBagLayout bagLayout = new GridBagLayout();//creating object of GridBagLayout
        GridBagConstraints bagConstraints = new GridBagConstraints();//creating object of GridBagConstratints
        frame1.setSize(700, 500);//setting the size of first JFrame
        frame1.setLayout(bagLayout);//setting the layout to GridBagLayout of first JFrame
        bagConstraints.insets = new Insets(15, 40, 0, 0);//Setting the padding between the components and neighboring components
      //Setting the property of JLabel and adding it to the first JFrame
        nameLabel = new JLabel("Enter RollNo");
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        frame1.add(nameLabel, bagConstraints);
      //Setting the jlabel for password
      //Setting the property of JTextfield and adding it to the first JFrame
        nameTextField = new JTextField(15);
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        frame1.add(nameTextField, bagConstraints);
 
      //Setting the property of JButton(Fetch Data) and adding it to the first JFrame
        fetchButton = new JButton("Show results");
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 1;
        bagConstraints.ipadx = 60;
        frame1.add(fetchButton, bagConstraints);
 
      //Setting the property of JButton(Reset Data) and adding it to the second JFrame
        resetButton = new JButton("Clear Data");
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 1;
        frame1.add(resetButton, bagConstraints);
 
        //adding ActionListener to both buttons
        fetchButton.addActionListener(this);
        resetButton.addActionListener(this);
 
 
        frame1.setVisible(true);//Setting the visibility of First JFrame
        frame1.validate();//Performing relayout of the First JFrame
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
 
        if (e.getSource() == fetchButton) {
 
            String userName = nameTextField.getText().toString();//getting text of username text field and storing it in a String variable
            frameSecond(userName);//passing the text value to frameSecond method
 
        }
        if (e.getSource() == resetButton) {
            nameTextField.setText("");//resetting the value of username text field
        }
 
    }
 
 
    public void frameSecond(String userName) {
   
     //setting the properties of second JFrame
        frame2 = new JFrame("Database Results");
        frame2.setLayout(new FlowLayout());
        frame2.setSize(700, 500);
 
        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(600, 100));
        table.setFillsViewportHeight(true);
        frame2.add(new JScrollPane(table));
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Roll No");
        defaultTableModel.addColumn("dob");
        defaultTableModel.addColumn("Subject 1");
        defaultTableModel.addColumn("Subject 2");
        defaultTableModel.addColumn("Subject 3");
        try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
			Statement st = con.createStatement();
            String query = "select * from Details where ROLL = '" + userName + "'";//Storing MySQL query in A string variable
            String query_mark="select * from marks where ROLL='"+userName+"'";
            ResultSet resultSet = st.executeQuery(query);//executing query and storing result in ResultSet
            //System.out.println(query);

            String name="",roll="",pass="",dob="",m1="",m2="",m3="";
            while (resultSet.next()) {
       
             //Retrieving details from the database and storing it in the String variables
            	roll = resultSet.getString("ROLL");
            name = resultSet.getString("NAME");
                pass = resultSet.getString("DOB");
                dob = pass;    

                break;
            }
            
            ResultSet resulset_mark=st.executeQuery(query_mark);
     
            while(resulset_mark.next()) {
            roll=resulset_mark.getString("ROLL");
            m1=resulset_mark.getString("mark1");
            m2=resulset_mark.getString("mark2");
            m3=resulset_mark.getString("mark3");
            }
            if (userName.equalsIgnoreCase(roll)) {
                flag = 1;
                defaultTableModel.addRow(new Object[]{name,roll,dob,m1,m2,m3});//Adding row in Table
                frame2.setVisible(true);//Setting the visibility of second Frame
                frame2.validate();
            }
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Wrong rollno");//When invalid username is entered
            }
 
 
        } catch (SQLException throwables) {

            throwables.printStackTrace();
        }
 
 
    }
}
