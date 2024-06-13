package h1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="us123_tbl")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String pass;
private String salary;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String email, String pass, String salary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.pass = pass;
	this.salary = salary;
}
public User(String name, String email, String pass, String salary) {
	super();
	this.name = name;
	this.email = email;
	this.pass = pass;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", salary=" + salary + "]";
}


}
