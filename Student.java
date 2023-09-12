package com.manaswini.StudentManagementSystem;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feeTotal;
	
	public Student(int id,String name,int grade) {
		this.feesPaid=0;
		this.feeTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	public void payFees(int fee) {
		feesPaid+=fee;
		School.updateTotalMoneyEarned(fee);
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeeTotal() {
		return feeTotal;
	}
	
	public int getRemainFees() {
		return feeTotal-feesPaid;
	}
}
