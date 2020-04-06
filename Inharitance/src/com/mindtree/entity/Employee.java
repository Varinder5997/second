package com.mindtree.entity;

public abstract class Employee {
	private int employeeId;
	private String employeeName;
	private float basicPay;
	private float hraPay;
	private float daPay;
	public abstract float calculateSalary();
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(float basicPay) {
		this.basicPay = basicPay;
	}
	public float getHraPay() {
		return hraPay;
	}
	public void setHraPay(float hraPay) {
		this.hraPay = hraPay;
	}
	public float getDaPay() {
		return daPay;
	}
	public void setDaPay(float daPay) {
		this.daPay = daPay;
	}
	
}
