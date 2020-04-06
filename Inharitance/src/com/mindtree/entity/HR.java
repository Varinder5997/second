package com.mindtree.entity;

public class HR extends Employee{
	
	private float gratitudePay;

	public float getGratitudePay() {
		return gratitudePay;
	}

	public void setGratitudePay(float gratitudePay) {
		this.gratitudePay = gratitudePay;
	}
	public float calculateSalary() {
		float hrSalary;
		hrSalary=(getBasicPay()+getDaPay()+getHraPay())+((getBasicPay()+getHraPay()+getDaPay())*(getGratitudePay()/100));
		return hrSalary;
	}
	
	public HR() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HR gratitudePay = "+ getGratitudePay() + " Total Salary = "
				+ calculateSalary() + " EmployeeId = " + getEmployeeId() + " EmployeeName = "
				+ getEmployeeName() + " BasicPay = " + getBasicPay() + "HraPay = " + getHraPay()
				+ " DaPay = " + getDaPay() ;
	}
	
	

}
