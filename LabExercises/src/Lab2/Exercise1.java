package Lab2;

//Create a method which accepts an array of integer elements and 
//return the second smallest element in the array
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	static void array(int [] arr) {
		Arrays.sort(arr);
		int number=arr[1];
		System.out.println("The second smallest element is: "+number);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		array(arr);
		
	}
}