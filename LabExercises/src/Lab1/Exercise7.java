package Lab1;
import java.util.Scanner;

public class Exercise7 {
    static boolean checkNumber(int n) {
		 boolean increasing = false;
	        while(n>0) {
	            int lastDigit = n % 10;
	            n /= 10;
	            int nextLastDigit = n % 10;
	            if(nextLastDigit<=lastDigit) {
	                increasing=true;
	            }
	            else {
	                increasing=false;
	                break;
	            }
	        }
	        return increasing;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("True");
		else
			System.out.println("False");

	}

}