package com.mindtree.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.entity.Develpor;
import com.mindtree.entity.HR;

public class EmployeeApplication {

	public static void main(String[] args) {
		HR hr=new HR();
		Develpor dv=new Develpor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for dveloper salary");
		System.out.println("Enter 2 for hr salary");
		int choice=sc.nextInt();
		boolean flag=true;
		while(flag) {
			switch(choice) {
			case 1:
				System.out.println("Enter the number of the Develpors");
				int number=sc.nextInt();
				Develpor develporData[]=new Develpor[number];
				//List<Develpor>l1=new ArrayList<Develpor>();
				//l1.add(0,new Develpor());
				//l1.add();
				for(int i=0;i<number;i++) {
			    develporData[i]=new Develpor();
				System.out.println("Enter the Id");
				develporData[i].setEmployeeId(sc.nextInt());
				System.out.println("Enter the Name");
				sc.nextLine();
				develporData[i].setEmployeeName(sc.nextLine());
				System.out.println("Enter the basic Pay");
				develporData[i].setBasicPay(sc.nextFloat());
				System.out.println("Enter the da pay");
				develporData[i].setDaPay(sc.nextFloat());
				System.out.println("Enter the hraPay");
				develporData[i].setHraPay(sc.nextFloat());
				System.out.println("Enter the incentive pay");
				develporData[i].setInentivePay(sc.nextFloat());
				System.out.println("Develpor salary : "+dv.calculateSalary());
				}
				displayDevelpor(develporData);

				break;
			case 2:
				System.out.println("Enter the number of hrs");
				int numberOfHr=sc.nextInt();
				HR[] hrData=new HR[numberOfHr];
				for(int i=0;i<numberOfHr;i++) {
				hrData[i]=new HR();
				System.out.println("Enter the Id");
				hrData[i].setEmployeeId(sc.nextInt());
				System.out.println("Enter the Name");
				sc.nextLine();
				hrData[i].setEmployeeName(sc.nextLine());
				System.out.println("Enter the basic Pay");
				hrData[i].setBasicPay(sc.nextFloat());
				System.out.println("Enter the hra Pay");
				hrData[i].setHraPay(sc.nextFloat());
				System.out.println("Enter the da  pay");
				hrData[i].setDaPay(sc.nextFloat());
				System.out.println("ENter the gratitude pay");
				hrData[i].setHraPay(sc.nextFloat());
				
				}
				displayHrData(hrData);

			
				break;
				
			case 3:
				flag=false;
				break;
			}
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for dveloper salary");
			System.out.println("Enter 2 for hr salary");
			choice=sc.nextInt();
		}
				
		

	}
	public static void displayDevelpor(Develpor [] develporData) {
		for(int i=0;i<develporData.length;i++) {
			System.out.println(develporData[i].toString());
		}
	}
	public static void displayHrData(HR [] hrData) {
		for(int i=0;i<hrData.length;i++) {
			System.out.println(hrData[i].toString());
		}
	}
}
