package com.mindtree.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.entity.Employee;
import com.mindtree.service.EmployeeService;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee>employeeData=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of the Employees");
		///int numberOfEmployees=sc.nextInt();
	/*	for (int i = 0; i < numberOfEmployees; i++) {
			Employee employee=new Employee();
			
			System.out.println("Enter the Id of the employee");
			employee.setEmployeeId(sc.nextInt());
			System.out.println("Enter the Name of the employee");
			sc.nextLine();
			employee.setEmployeeName(sc.nextLine());
			System.out.println("Enter the department of the employee");
			employee.setEmployeeDepartment(sc.nextLine());
			employeeData.add(employee);
			
		}
		
		System.out.println("Enter the id of the employee you want to find");
		int id=sc.nextInt();
		EmployeeService.displayDetails(employeeData,id);
*/		
		String name="Varinder";
		String name1="Bhatti";
		Employee employee=new Employee();
		Employee employee1=new Employee();
		employee.setEmployeeId(2);
		employee.setEmployeeName("varinder");
		employee.setEmployeeDepartment("java");
		employee1.setEmployeeId(2);
		employee1.setEmployeeName("singh");
		employee1.setEmployeeDepartment("java");
		
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
	}

	

}
