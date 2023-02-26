package Bootathon1;

import java.sql.*;

public class Connectivity {
	public String a,b,c,d;
	public void insertDetails() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
			Statement st = con.createStatement();
			
			String str = "insert into Details values('"+a+"','"+b+"','"+c+"')";
			//System.out.println(str);
			st.executeUpdate(str);
			
			str = "insert into user1 values('20euec"+a+"', '"+c+"')";
			st.executeUpdate(str);

		}
		catch(Exception e) {}
	}
	
	public void updateDetails(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
			Statement st = con.createStatement();
			
			String str = "update Details set name='"+b+"',dob='"+c+"' where roll='"+a+"'";	
			System.out.println(str);
			st.executeUpdate(str);
			
		}
		catch(Exception e) {}
		
	}
	
	public void delete(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
			Statement st = con.createStatement();
			
			String str = "delete from Details where roll='"+a+"'";
			System.out.println(str);
			st.executeUpdate(str);
		}
		catch(Exception e) {}
	}
	
	public void insertMarks() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
			Statement st = con.createStatement();
			
			String str = "insert into Marks values('"+d+"','"+a+"','"+b+"','"+c+"')";
			//System.out.println(str);
			st.executeUpdate(str);
			
		}
		catch(Exception e) {}
	}	
	
	public String CheckPass(String userName, String s) {
		String ret="";
		if(s.equals("admin")) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
				Statement st = con.createStatement();
				
				String str = "select pass from admin where username = '"+userName+"'";
				
				ResultSet set = st.executeQuery(str);
				
				set.next();
				ret = set.getString("pass");
				
			}
			catch(Exception e) {}
		}
		else if(s.equals("user")) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Kavin");
				Statement st = con.createStatement();
				
				String str = "select pass from user1 where username = '"+userName+"'";
				//System.out.println(str);
				
				ResultSet set = st.executeQuery(str);
				
				while(set.next()) {
				ret = set.getString("pass");
				break;
				}
				
			}
			catch(Exception e) {}
		}
		
		return ret;
	}
}
