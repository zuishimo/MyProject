package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Delete {

	public static void main(String[] args) {
	
		List<Hero> collection = new ArrayList<Hero>();
		
		for (int i = 0; i < 100; i++) {
			collection.add(new Hero("��ʱħ" + i));
		}
		System.out.printf("ɾ��֮ǰ��%s%n",collection);
		
		List<Hero> deleteHero = new ArrayList<Hero>();
		
		for (Hero hero1 : collection) {
			int a = Integer.parseInt(hero1.name.substring(3));
			if(a%8==0)
				deleteHero.add(hero1);
		}
		for (Hero hero2 : deleteHero) {
			collection.remove(hero2);
		}
		System.out.println("ɾ��֮��" + collection);
	}
}
