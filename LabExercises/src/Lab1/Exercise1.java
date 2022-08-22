package Lab1;

import java.util.Scanner;

public class Exercise1 {

	static void sumofCube(int n) {
		double cube;
		double sum=0;
		int r;
		while(n>0) {
		r=n%10;
		cube=r*r*r;
		sum+=cube;
		n/=10;
		
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		sumofCube(n);
		sc.close();
	}

}
