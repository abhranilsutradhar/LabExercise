package Lab1;
//Create a class with a method to find the difference between the sum of the squares and
//the square of the sum of the first n natural numbers.

import java.util.Scanner;

public class Exercise6 {
	static void calculateSum(int n){
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) 
				sum+=i;
			}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		calculateSum(n);

	}

}

