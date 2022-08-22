package com.cg.eis.exception;

import java.util.*;

public class EmployeeException extends Exception {
	EmployeeException(String s){
		super(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of the employee: ");
		double salary = sc.nextDouble();
		try {
			if(salary<3000)
				throw new EmployeeException("Salary shouldn't be below 3000");
			else
				System.out.println("Salary of the employee is: "+salary);
			}
		catch(EmployeeException e) {
			System.out.println(e);
		}

	}

}