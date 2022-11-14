package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reg {
	public Reg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reg(int uid, String name, String email, String password, int age) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private int age;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Reg [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ "]";
	}
    

}
