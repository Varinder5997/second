package com.mindtree.client;

import java.util.Scanner;

import com.mindtree.entity.Person;
import com.mindtree.service.PersonServices;

public class PersonApplication {

	private static PersonServices personservices = new PersonServices();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the persons");
		int numberOfPersons = sc.nextInt();
		Person[] personData = new Person[numberOfPersons];
		inputData(personData);
		display(personData);
		System.out.println("Average Salary is " + personservices.averageSalary(personData));

	}

	public static void inputData(Person[] personData) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < personData.length; i++) {
			personData[i] = new Person();
			System.out.println("Enter the id of the person");
			personData[i].setPersonId(sc.nextInt());
			System.out.println("Enter the name of the person");
			sc.nextLine();
			personData[i].setPersonName(sc.nextLine());
			System.out.println("Enter the salary of the person");
			personData[i].setPersonSalary(sc.nextDouble());

		}
	}



	public static void display(Person[] personData) {
		for (int i = 0; i < personData.length; i++) {
			System.out.println("Id is : " + personData[i].getPersonId());
			System.out.println("Name is : " + personData[i].getPersonName());
			System.out.println("Salary is : " + personData[i].getPersonSalary());
			System.out.println("\n");
		}
	}
}
