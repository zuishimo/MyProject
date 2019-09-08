package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestItem {

	public static void main(String[] args) {
		
		List<Item> wepon = new ArrayList<Item>();
		
		for (int i = 0; i < 10; i++) {
			int price = (int)(Math.random()*2000);
			wepon.add(new Item("wepon" + i,price));			
		}
		System.out.println("weponÎ´ÅÅÐòÇ°£º");
		System.out.println(wepon);
		System.out.println();
		
		Collections.sort(wepon);
		System.out.println("weponÅÅÐòºó£º" );
		System.out.println(wepon);
	}
	
}
