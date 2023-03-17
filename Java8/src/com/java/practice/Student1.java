package com.java.practice;

public class Student1 {

	int id;

	String name;
	String subject;
	double percentage;
	public Student1(String name,int id,  String subject, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.percentage = percentage;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", subject=" + subject + ", percentage=" + percentage + "]";
	}
	

}
