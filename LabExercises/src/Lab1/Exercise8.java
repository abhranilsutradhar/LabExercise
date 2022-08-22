package Lab1;

//Create a method to check if a number is a power of two or not

import java.util.Scanner;

public class Exercise8 {
	 
	static boolean checkNumber(int n) {
		 while(n%2==0) {
			 n=n/2;
		 }
		 return (n==1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
