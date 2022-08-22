package Lab2;

//Create a method which accepts an integer array, reverse the numbers in the array and
//returns the resulting array in sorted order
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise3 {
	static void reverse(ArrayList<Integer> arr) {
		Collections.sort(arr,Collections.reverseOrder()); 
		for(Integer x:arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			Integer temp = sc.nextInt();
			arr.add(temp);
		}
		reverse(arr);

	}
}