package LambdaExpression;

import java.util.ArrayList;

import Charactor.Hero;

public class TestLambda {

	public static void main(String[] args) {
		
		ArrayList<Hero> heros =new ArrayList<Hero>();
		
		for (int i = 0; i < 10; i++) {
			int hp = (int)(Math.random()*1000);
			int damage= (int)(Math.random()*500);
			
			heros.add(new Hero("ÌáÄª" + i,hp,damage));
						
		}
		
        HeroChecker checker = new HeroChecker() {
			
			@Override
			public boolean test(Hero h) {
				// TODO Auto-generated method stub
				return (h.hp>500 && h.damage>100);
			}
		};
		
		filter(heros, checker);
	}
	
	public static void filter(ArrayList<Hero> heros,HeroChecker checker) {
		
		for (Hero hero : heros) {
			if(checker.test(hero))
				System.out.println(hero);			
		}
	}
}
