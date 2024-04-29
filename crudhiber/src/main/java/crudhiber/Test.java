package crudhiber;

import crudhiber.model.User;
import crudhiber.model.UserDao;

public class Test {

	public static void main(String[] args) {
		UserDao ud=new UserDao();
		User u=new User();
		
		//create
		u.setName("neha");
		u.setEmail("gtrfd.com");
		u.setPass("123");
		ud.insert(u);
		System.out.println("Data Inserted");
		
		//Show
		User sh=ud.Show(3);
		System.out.println("User Details: "+sh);
		
		
	    //update
		u.setName("Sakshi");
		u.setEmail("neha1@gmail.com");
		u.setPass("3");
		ud.edit(u);
		System.out.println("Data UPdated");
		
		//Delete
		ud.remove(2);
		System.out.println("Data Deleted");

	}

}
