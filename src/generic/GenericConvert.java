package generic;
import java.util.ArrayList;

import Charactor.*;

public class GenericConvert {

	public static void main(String[] args) {
		
		ADHero teemo = new ADHero("提莫");
		
		Hero hero = teemo;
		System.out.println(hero);
		
		ArrayList<Hero> heroCopy = new ArrayList<Hero>();
		ArrayList<ADHero> adhero = new ArrayList<ADHero>();
		
		
		//无法转换成功，因为如果能成功的话，就相当于hero这个引用指向了一个ADHero的
		//泛型容器，如果转换成功的话，就相当于在一个ADHero的容器中可以放APHero，出现矛盾
//		heroCopy = adhero;
		
		
	}
	
}
