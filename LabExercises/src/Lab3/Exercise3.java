package Lab3;

import java.util.Scanner;

public class Exercise3 {
	static void consonant(String w) {
		String v="aeiouAEIOU ";
        String z="";
        for (int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            if(v.indexOf(c)==-1)
                {
                    c++;
                   
                }
                z+=c;
        }
        System.out.println("Modified Sentence is "+z);
	}
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a Sentence");
        String w=sc.nextLine();
        consonant(w);
        sc.close();
    }
}










