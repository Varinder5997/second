package com.mindtree.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.CORBA.ExceptionList;

public class DetailOfException {
	int q;
	public static void main(String[] args) {
		try {
			
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[0];
		int c=arr[0];
		int b=a/0;
		DetailOfException []arr1=new DetailOfException[3];
		arr1[1].q=3;
		}
		catch(ArithmeticException e){
		
			System.out.println("Number can not divided by 0");
		}
		catch(InputMismatchException e){
			System.out.println("Input Miss match");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bond");
		}
		catch(NullPointerException e){
			System.out.println("Null pointer Exception");
		}
		
		
	}

}
