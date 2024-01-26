package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class UserDao {

//	Step 1
//	1. create a driver
// 	2. create a connection
//	3. create a statement
//	4. execute query
//	5.close the connection
	
	//step 1
//		Class.forName("com.mysql.jdbc.Driver");
//	    System.out.println("Step 1");
//	    //step 2
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2023","root","abc123");
//	    System.out.println("Step 2");
//	    
//	    //step 3
//	    Statement st=con.createStatement();
//	    System.out.println("Step 3");
//	    
//	    //step4
//	    int a=st.executeUpdate("insert into student_tbl values(222,'geeta','pune','geeta@gmail.com')");// insert update delete 
//	    System.out.println("Step 4");
//	    if(a>0)
//	    {
//	    	System.out.println("Data Inserted");
//	    }
//	    else
//	    {
//	    	System.out.println("Data Not Inserted");
//	    }
//	    
//	    //step 5
//	    con.close();
//	    System.out.println("Step 5");
	Connection getConnect() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Step1");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "abc123");
	System.out.println("Step2");
	return con;
	}
	
 public int insert(User u) throws ClassNotFoundException, SQLException{
	Connection con= getConnect();
	PreparedStatement st=con.prepareStatement("insert into student_tbl (uname,uemail,upass)");
	st.setString(1, u.getUname());
	st.setString(2, u.getUemail());
	st.setString(3, u.getUpass());
	System.out.println("Step 3");
	
	int a=st.executeUpdate();
	System.out.println("Step 4");
	
	con.close();
	System.out.println("Step 5");
	
	return a;
}
	
public boolean checkuser(String uname,String uemail,String upass) throws ClassNotFoundException, SQLException{
	Connection con=getConnect();
	String sql="Select * from user_tbl where uemail=? and upass=?";
	PreparedStatement st=con.prepareStatement(sql);
	st.setString(1,uemail);
	st.setString(2, upass);
	
	ResultSet rs=st.executeQuery();
	boolean a=rs.absolute(1);
	con.close();
	return a;	
	

}


 
}
