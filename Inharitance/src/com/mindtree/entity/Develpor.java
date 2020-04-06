package com.mindtree.entity;

public class Develpor extends Employee{
	private float incentivePay;
	
	
	public float getInentivePay() {
		return incentivePay;
	}

	public void setInentivePay(float incentivePay) {
		this.incentivePay = incentivePay;
	}

	public float calculateSalary() {
		float developerSalary=(getBasicPay()+getDaPay()+getHraPay())+((getBasicPay()+getDaPay()+getHraPay())*(getInentivePay()/100));
		return developerSalary;
	}

	public Develpor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Develpor InentivePay = " + getInentivePay()
				+ " Total Salary = " + calculateSalary() + " EmployeeId = " + getEmployeeId()
				+ " EmployeeName = " + getEmployeeName() + " BasicPay = " + getBasicPay() + " HraPay = "
				+ getHraPay() + " DaPay = " + getDaPay() ;
	}
	
	
	
}
