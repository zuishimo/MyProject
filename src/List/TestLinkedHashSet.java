package List;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		System.out.println("PI=" + Math.PI);
		printlnPI(num);
		HashSet<Hero> h ;
	}
	
	public static void printlnPI(LinkedHashSet<Integer> num) {
		
		String pi = String.valueOf(Math.PI);
		char ch[] = pi.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) 	
				num.add(Integer.parseInt(String.valueOf(ch[i])));
		}
		
		System.out.println(num);
	}
}
