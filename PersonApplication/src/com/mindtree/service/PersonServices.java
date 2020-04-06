package com.mindtree.service;

import com.mindtree.entity.Person;

public class PersonServices {

	public double averageSalary(Person[] personData) {
		double totalSalary = 0;
		for (int i = 0; i < personData.length; i++) {
			totalSalary = totalSalary + personData[i].getPersonSalary();

		}
		return totalSalary / personData.length;
	}

}
