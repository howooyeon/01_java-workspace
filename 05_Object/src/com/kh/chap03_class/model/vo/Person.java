package com.kh.chap03_class.model.vo;

public class Person {

	// 필드선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	// setter 메소드 (7개)
	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	// getter 메소드 (7개)
	
	public String getId() {
		return id;
	}
	
	public String getpwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEamil() {
		return email;
	}


	public String information() {
		
		return "ID : " + id + ", Password : " + pwd + ", Name : " + name + ", Age : " + age + ", Gender : " + gender + ", Phone : " + phone + ", Email : " + email;
		
		
	}



	
	

}
