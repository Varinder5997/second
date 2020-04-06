package com.mindtree.codingchalange.service;

import java.util.Scanner;

import com.mindtree.codingchalange.entity.Furniture;

public class FurnitureService {
	Scanner sc=new Scanner(System.in);
		Furniture []furnitureList;
		public String addFurniture(int number) {
			furnitureList=new Furniture[number];
			for(int i=0;i<number;i++) {
				furnitureList[i]=new Furniture();
				System.out.println("Enter the id ");
				furnitureList[i].setFurnitureId(sc.nextInt());
				System.out.println("Enter the Name");
				sc.nextLine();
				furnitureList[i].setFurnitureName(sc.nextLine());
				System.out.println("Enter the cost");
				furnitureList[i].setFurnitureCost(sc.nextDouble());
				System.out.println("Enter the quentity");
				furnitureList[i].setFurnitureQuentity(sc.nextInt());
			}
			
			return "Furniture is added SuccesFully";
		}
		public String sortedForm() {
			for(int i=1;i<furnitureList.length;i++) {
				int j=i-1;
				Furniture cost=furnitureList[i];
				while(j>=0 && furnitureList[j].getFurnitureCost()<cost.getFurnitureCost()) {
					furnitureList[j+1]=furnitureList[j];
					j=j-1;
				}
				furnitureList[j+1]=cost;
			}
			
			
			return "List is Sorted";
		}
		
		public String buyFurniture(String Name) {
			int count=0;
			int j=0;
			double cost=0;
			int quentityLeft=0;
			for(int i=0;i<furnitureList.length;i++) {
				if(furnitureList[i].getFurnitureName().compareTo(Name)==0) {
					count=1;
					j=i;
				}
			}
			if(count==0) {
				return "Product does not Exist";
			}
			else {
				System.out.println("Enter the quentity you want");
				int quentity=sc.nextInt();
				if(furnitureList[j].getFurnitureQuentity()<quentity) {
					return ("Invalid Input");
				}
				else {
					cost=furnitureList[j].getFurnitureCost()*quentity;
					quentityLeft=furnitureList[j].getFurnitureQuentity()-quentity;
					System.out.println("Cost is"+ cost);
					System.out.println("Quentity Left"+quentityLeft);
					furnitureList[j].setFurnitureQuentity(quentityLeft);
					return "Purchasing is done";
				}
			}
		}
		
		public String binarySearch(int id) {
			for(int i=0;i<furnitureList.length;i++) {
				for(int j=0;j<furnitureList.length;j++) {
					if(furnitureList[i].getFurnitureId()<furnitureList[j].getFurnitureId()) {
						Furniture c=new Furniture();
						c=furnitureList[i];
						furnitureList[i]=furnitureList[j];
						furnitureList[j]=c;
					}
				}
			}
			
			int first=0;
			int count=0;
			int last=furnitureList.length-1;
			while(first<=last ) {
				int mid=(first+last)/2;
				if(furnitureList[mid].getFurnitureId()==id) {
					count++;
					break;
				
				}
				else if(furnitureList[mid].getFurnitureId()>id) {
					last=mid-1;
					
				}
				else if(furnitureList[mid].getFurnitureId()<id){
					first=mid+1;
				}
				
			}
			
			if(count==0) 
			{
			return "Id is not Found";
				}
				else {
					return "Furniture Id is found";
				}
			
		}
		
		public void display() {
			for (int i=0;i<furnitureList.length;i++) {
				System.out.println("Id : "+furnitureList[i].getFurnitureId());
				System.out.println("Name "+furnitureList[i].getFurnitureName());
				System.out.println("Cost : "+furnitureList[i].getFurnitureCost());
				System.out.println("Quentity : "+furnitureList[i].getFurnitureQuentity());
			}
		}
}
