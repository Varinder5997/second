package com.mindtree.service;

import java.util.LinkedList;
import java.util.List;

import com.mindtree.entity.Employee;

public class EmployeeService {
	public static void displayDetails(List<Employee>employeeData,int id) {
		for (Employee employee : employeeData) {
			if(employee.getEmployeeId()==id) {
				System.out.println(employee.toString());
			}
		}
	}
}
