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
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        System.out.println("ʹ��Lamdba�ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��:");
        filter(heros,h->h.hp>500 && h.damage>200);
    }
 
    private static void filter(List<Hero> heros,HeroChecker checker) {
    	for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero + ", ");
        }
    }
 
}
