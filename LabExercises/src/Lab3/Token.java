package Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbers by comma: ");
			String str = sc.next();
			StringTokenizer st = new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				sc.close();
			}

		}

	}

