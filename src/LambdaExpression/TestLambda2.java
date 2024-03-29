package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
import Charactor.Hero;
 
public class TestLambda2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(500)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄:");
        filter(heros,h->h.hp>500 && h.damage>200);
    }
 
    private static void filter(List<Hero> heros,HeroChecker checker) {
    	for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero + ", ");
        }
    }
 
}
