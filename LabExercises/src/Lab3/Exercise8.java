package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    static boolean AlphabaticOrder(String s)
    {
    	int n = s.length();
    	char c[] = new char [n];
    	for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
    	Arrays.sort(c);
    	for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
     
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        if (AlphabaticOrder(str))
           System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
           
    }
   
}
