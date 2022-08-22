package Lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise3 {
	
	static void getSquares(int [] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n: a) {
	      map.put( n, n*n);
	    }
		Set<Entry<Integer, Integer>>entries =map.entrySet();
		for(Entry<Integer, Integer> entry : entries)
			System.out.println(entry.getKey()+"\t"+"\t"+entry.getValue());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int x = sc.nextInt();
		System.out.println("Enter some numbers");
		int[]a=new int[x];
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Numbers "+"\t"+"Squares");
		getSquares(a);
	}
}
