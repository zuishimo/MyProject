package LambdaExpression;

import java.util.Comparator;


import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Collections;

import Charactor.*;

public class TestLambda3 {

	public static void main(String[] args) {
		Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();
             
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero "+ i, r.nextInt(1000), r.nextInt(200)));
        }
        
        //���þ�̬����
//        filter(heros,TestLambda3 :: testHero);
        
        //���ö��󷽷�
//        TestLambda3 lambda = new TestLambda3();
        
        //���������еĶ���ķ���      
//        filter(heros,Hero :: matched);
        
        //���ù��췽��
//        List list3 = getList(ArrayList :: new);

	}
	
	public static List getList(Supplier<List> s) {
		
		return s.get();
	}
	
	public boolean testHero (Hero h) {
		
		return h.hp>100 && h.damage<50;
	}
	
	public static void filter(List<Hero> list,HeroChecker checker) {
		for (Hero hero : list) {
			if(checker.test(hero))
				System.out.println(hero);
		}
		
	}
	
}
