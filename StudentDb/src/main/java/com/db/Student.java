package com.db;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String branch;

	public Student(int id,String name,String email,String branch) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.branch=branch;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getBranch() {
		return branch;
	}
	
	}
