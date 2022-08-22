package Lab1;

//The Fibonacci sequence is defined by the following rule. 
//The first 2 values in the sequence are 1, 1.
//Every subsequent value is the sum of the 2 values preceding it. 
//Write a Java program to print the nth value of the Fibonacci sequence

import java.util.Scanner;

public class Exercise3 {
	static void fibbo(int n){
		int a=1;
		int b=1;
		int c=0;
		if(n==1 || n==2)
			System.out.println(a);
		else {
			for(int i=0;i<n-2;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		fibbo(n);
	}

}