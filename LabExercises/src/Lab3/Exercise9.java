package Lab3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercise9 {

		public static void DayMonthYear(String Date){
			 
	        LocalDate currentDate = LocalDate.parse(Date);
	 
	        int day = currentDate.getDayOfMonth();
	 
	        Month month = currentDate.getMonth();
	 
	        int year = currentDate.getYear();
			System.out.println("Day: " + day);
			System.out.println("Month: " + month);
			System.out.println("Year: " + year);
		}

		
		public static void main(String args[])
		{
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter date in yy-mm-dd:-");
	        String Date= sc.next();
	        DayMonthYear(Date);
	        sc.close();
			
		}
	}

