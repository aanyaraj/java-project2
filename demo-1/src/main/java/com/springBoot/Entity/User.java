package com.springBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name= "User_Detail")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String name;
private String city;
private int age;


public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(int userId, String name, String city, int age) {
	super();
	this.userId = userId;
	this.name = name;
	this.city = city;
	this.age = age;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
