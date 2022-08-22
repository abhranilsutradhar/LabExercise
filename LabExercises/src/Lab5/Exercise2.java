package Lab5;

import java.util.*;

class InvalidNameException extends Exception {
    InvalidNameException(String s) {
        super(s);
    }
} 


public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		System.out.println("Enter last name: ");
		String lastName = sc.next();
		try {
			if (firstName.isEmpty() &&  lastName.isEmpty())
		         throw new InvalidNameException("Employee First and last name is blank");
		    else if(firstName.isEmpty())
				throw new InvalidNameException("Employee First name is blank");
			else if(lastName.isEmpty())
				throw new InvalidNameException("Employee Last name is blank");
			else
				System.out.println("Name is: "+firstName+" "+lastName);
		}
		catch(InvalidNameException e) {
			System.out.println(e);
		}
		
	}

}
