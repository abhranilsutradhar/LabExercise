package Lab2;
//Create a method that can accept an array of String objects and sort in alphabetical order.
//The elements in the left half should be completely in uppercase and 
//the elements in the right half should be completely in lower case.
//Return the resulting array.

import java.util.*;

public class Exercise2 {
	static void arraySort(String [] arr,int n) {
		Arrays.sort(arr);
		if(n%2==0) {
			for(int i=0;i<(n/2);i++) {
				System.out.println(arr[i].toUpperCase());
			}
			for(int i=(n/2);i<n;i++) {
				System.out.println(arr[i].toLowerCase());
			}
		}
		else if(n%2!=0) {
			for(int i=0;i<=(n/2);i++) {
				System.out.println(arr[i].toUpperCase());
			}
			for(int i=(n/2)+1;i<n;i++) {
				System.out.println(arr[i].toLowerCase());
			}
		}
		else
			System.out.println("No Elements");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		String [] arr = new String[n];
		for(int i=0;i<=n-1;i++){
			arr[i]=sc.next();
		}
		arraySort(arr,n);
	}
	
}