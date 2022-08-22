package Lab1;


//Write a Java program that prompts the user for an integer and
//then prints out all the prime numbers up to that Integer

import java.util.Scanner;

public class Execise4 {
	
	static void prime(int n) {
		int a;
		for (int i=1; i<=n; i++){
			a=0;
			for (int j=1; j<=i; j++){
				if (i%j == 0)
					a++;
			}
		if (a==2)
		System.out.println (i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		prime(n);
	}

}
