package com.jspdemo.models;

public class User {
	int id;
	String name, password, email, sex, country;
	public User() {}
	
	public void setId(int id) { this.id = id;}
	public void setName(String name) { this.name = name;}
	public void setPassword(String password) { this.password = password;}
	public void setEmail(String email) { this.email = email;}
	public void setSex(String sex) { this.sex = sex;}
	public void setCountry(String country) { this.country = country;}

	public int getId() { return this.id;}
	public String getName() { return this.name ;}
	public String getPassword() { return this.password;}
	public String getEmail() { return this.email;}
	public String getSex() { return this.sex ;}
	public String getCountry() { return this.country;}
}
