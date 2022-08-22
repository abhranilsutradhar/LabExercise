package Lab3;

public class Exercise5 {
	static int wordcount(String str) {  
	      int count=0;  
	  
	        char ch[]= new char[str.length()];     
	        for(int i=0;i<str.length();i++)  
	        {  
	            ch[i]= str.charAt(i);  
	            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                count++;  
	        }  
	        return count;  
	    } 
		static int charactercount(String str) {
			int count=0; 
			for(int i=0;i<str.length();i++) { 
				char ch = str.charAt(i);
				if(ch!=' ')  
					count++; 
			}
			return count;
		}
		
			public static void main(String[] args) { 
		        String str = "my name is";
		        System.out.println(wordcount(str) + " words.");
		        System.out.println(charactercount(str) + " characters.");
		       
	  }  
	}