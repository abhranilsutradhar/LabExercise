package Lab6;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
	int SecondSmallest(int [] arr) 
	{
	Arrays.sort(arr);
	return arr[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i= 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Exercise5 e4= new Exercise5();
		System.out.println(e4.SecondSmallest(arr));

	}

}
