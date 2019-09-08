package generic;

import java.util.ArrayList;
import Charactor.*;

public class TestGeneric {
	
	public static void main(String[] args) {
		
		ArrayList h = new ArrayList();
		h.add(new Hero("Hero"));
		h.add(new ADHero("ADHero"));
		h.add(new APHero("APHero"));
		
		
		iterate(h);
	}
	
	public static void iterate(ArrayList<? extends Hero> heros) {
		
		for (Hero hero : heros) {
			System.out.println(hero.name);
		}	
		
	}
	

}
