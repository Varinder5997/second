package com.mindtree.exceptionapp.client;

import java.util.Scanner;

import com.mindtree.exceptionapp.exception.service.AddByFiveException;
import com.mindtree.exceptionapp.exception.service.AdditionAppServiceException;
import com.mindtree.exceptionapp.service.AdditionService;

public class ExceptionApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AdditionService additionService=new AdditionService();
		System.out.println("Enter number");
		int firstNumber=sc.nextInt();
		System.out.println("Ente rthe second number");
		int secondNumber=sc.nextInt();
		
			try {
				System.out.println(additionService.addNumber(firstNumber, secondNumber));
			} catch (AdditionAppServiceException e) {
				System.err.println(e.getMessage());
			}

	}

}
