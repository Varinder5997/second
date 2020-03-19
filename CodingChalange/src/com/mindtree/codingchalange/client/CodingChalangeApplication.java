package com.mindtree.codingchalange.client;

import java.util.Scanner;

import com.mindtree.codingchalange.service.FurnitureService;

public class CodingChalangeApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FurnitureService fs=new FurnitureService();
		boolean flag=true;
		do {
			System.out.println("1. for add the furniture");
			System.out.println("2. for sort decending order on cost based");
			System.out.println("3. for purchased furniture");
			System.out.println("4. for find furniture by Id");
			System.out.println("5. for exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number of furitures to add");
				int number=sc.nextInt();
				System.out.println(fs.addFurniture(number));
				break;
			
			case 2:
				System.out.println(fs.sortedForm());
				fs.display();
				break;
			
			case 3:
				System.out.println("Enter the name furnture you want to buy");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println(fs.buyFurniture(name));
				break;
			case 4:
				System.out.println("Enter the Id");
				int id=sc.nextInt();
				System.out.println(fs.binarySearch(id)); 
				break;
			case 5:
				flag=false;
				break;

			default:
				System.out.println("Enter the valid Input");
				break;
			}
		} while (flag);

	}

}
