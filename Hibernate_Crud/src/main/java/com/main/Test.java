package com.main;


import com.model.Student;
import com.model.UserDao;

public class Test {
	
	public static void main(String[] args) {
	
		
		UserDao ud=new UserDao();
		
		Student s=new Student();
		
		//create
		s.setName("dattatey");
		s.setAddress("panchadeshwar");
		ud.insert(s);
		System.out.println("Data Inserted::::::::");
		
		//show
		Student sh=ud.Select(1);
		System.out.println("Student details:"+sh);
		System.out.println("Data Shown::::::::");
		
		//update
		sh.setName("Riya");
		sh.setAddress("pune");
		ud.update(sh);
		System.out.println("Data updated:::::::::");
		
		//Delete
		ud.Delete(3);
		System.out.println("Data Deleted:::::::::");
	}

}
