package h1;

import org.apache.tomcat.util.buf.UDecoder;

import h1.model.User;
import h1.model.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud=new UserDao();
		User u=new User();

		//create
		u.setName("Neha Gajanan Girhe");
		u.setEmail("nehagirhe23@gmail.com");
		u.setPass("123");
		u.setSalary("1234");
		ud.insert(u);
		System.out.println("Data Inserted:::::::::::::::::");
		
		//show
		User sh=ud.select(1);
		System.out.println("Show Data : "+sh);
		
		//update
		
		u.setName("Shriyansh");
		u.setEmail("shriyansh@gmail.com");
		u.setPass("Shriyansh@123");
		u.setSalary("50999");
		ud.update(u);
		System.out.println("data updated");
	
		//delete
		ud.delete(4);
		System.out.println("Data Deleted");
		}
	
	
	}


