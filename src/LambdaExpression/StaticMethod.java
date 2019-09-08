package LambdaExpression;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import Charactor.*;
public class StaticMethod {

	 public static void main(String[] args) {
	        Random r =new Random();
	        List<Hero> heros = new ArrayList<Hero>();
	            
	        for (int i = 0; i < 10; i++) {
	            //通过随机值实例化hero的hp和damage
	            heros.add(new Hero("hero "+ i, r.nextInt(400), r.nextInt(200)));
	        }
	        System.out.println("初始化后的集合：");
	        System.out.println(heros);

	        //在Lambda中调用静态方法
//	        Collections.sort(heros,(h1,h2) -> StaticMethod.compare(h1, h2));
//	        Collections.sort(heros,StaticMethod::compare);
	        
	        //在Lambda中调用容器中的对象的方法
//	        Comparator<Hero> c = (h1,h2)-> h1.compareHero(h2) ;
//	        Collections.sort(heros,c);
//	        System.out.println(heros);
	        Collections.sort(heros,Hero::compareHero);
	        
	        
	        System.out.println("按照血量排序后的集合：");
	        System.out.println(heros);
	    }
	 
	 public static int compare(Hero h1,Hero h2) {
		 return h1.hp >= h2.hp ? 1:-1;
	 }
	
}
