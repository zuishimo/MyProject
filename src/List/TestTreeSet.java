package List;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			public int compare(Integer h1,Integer h2) {
				
				return h2-h1;
			}
			
		};
		
		Set<Integer> treeSet1 = new TreeSet<Integer>(c);
		Set<Integer> treeSet2 = new TreeSet<Integer>();
		for (int i = 0; i < 20; i++) {
            treeSet1.add(i);
            treeSet2.add(i);
        }
		System.out.println(treeSet2);
        System.out.println(treeSet1);
		
	}
	
}
