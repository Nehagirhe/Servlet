package crudhiber.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Us_tbl")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String pass;
private String email;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String pass, String email) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
	this.email = email;
}
public User(String name, String pass, String email) {
	super();
	this.name = name;
	this.pass = pass;
	this.email = email;
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
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + "]";
}

}
