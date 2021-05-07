package eTicaretBackendDemo.Entities.contretes;

import eTicaretBackendDemo.Entities.abstracts.IUser;

public class User implements IUser {
	private String firstName;
	private String lastName;
	private int age;
	private String eMail;
	private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User(String firstName, String lastName, int age, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.eMail = eMail;
		this.password = password;
	}

	
}
