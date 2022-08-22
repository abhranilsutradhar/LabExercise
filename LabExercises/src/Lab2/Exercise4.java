package Lab2;

//Create a method which accepts an integer array and removes all the duplicates in the array.
//Return the resulting array in descending order
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	static void descending(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			int a1 = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = a1;
		}
	}
	static int duplicate(int [] a,int n) {
		if (n == 0 || n == 1) {
			return n;
  }
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		descending(a);
      n=duplicate(a,n);
      for (int i = 0; i < n; i++)
          System.out.print(a[i] + " ");
     
  }

}