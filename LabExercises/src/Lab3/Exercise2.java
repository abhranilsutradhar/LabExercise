package Lab3;

import java.util.*;

public class Exercise2 {
	
	public String mirror(String str) {
		StringBuffer st = new StringBuffer(str);
        st.append('|');
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        st.append(s);
        return st.toString();
	}

	public static void main(String[] args) {
		Exercise2 ex = new Exercise2();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println(ex.mirror(str));
        sc.close();
	}

}
