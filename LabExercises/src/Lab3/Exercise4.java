package Lab3;

import java.util.Scanner;

public class Exercise4 {
	static void modifyNumber(int n) {
		String str = Integer.toString(n);
		StringBuffer st = new StringBuffer(n);
		int a=0;
		int b=0;
		int difference=0;
		for (int i=0;i<str.length();i++){
			 char c = str.charAt(i);
			 char d = str.charAt(i+1);
			 a = Integer.parseInt(String.valueOf(c));
			 b = Integer.parseInt(String.valueOf(d));
			 difference=Math.abs(a-b);
			 st.append(difference);
		 }
		 String s = st.toString();
		 int e = Integer.valueOf(s);
		 System.out.println(e);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		modifyNumber(n);
		sc.close();
	}

}

		

