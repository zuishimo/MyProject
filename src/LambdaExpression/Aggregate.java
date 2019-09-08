package LambdaExpression;
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
 
import Charactor.*;
  
public class Aggregate {
  
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("���������е�ÿ�����ݣ�");
        heros
            .stream()
            .forEach(h->System.out.println(h));
        
        System.out.println("����һ�����飺");
        Object[] hs= heros
            .stream()
            .toArray();
        System.out.println(Arrays.toString(hs));
        
        System.out.println("�����˺���͵��Ǹ�Ӣ�ۣ�");
        Hero minDamageHero =
        heros
            .stream()
            .min((h1,h2)->h1.damage-h2.damage)
            .get();
        System.out.println(minDamageHero);
        
        System.out.println("�����˺���ߵ��Ǹ�Ӣ�ۣ�");
        Hero mxnDamageHero =
                heros
                .stream()
                .max((h1,h2)->h1.damage-h2.damage)
                .get();
        System.out.println(mxnDamageHero);     
         
        System.out.println("�������ݵ�������");
        long count = heros
                .stream()
                .count();
        System.out.println(count);
 
        System.out.println("��һ��Ӣ�ۣ�");
        Hero firstHero =
                heros
                .stream()
                .findFirst()
                .get();
         
        System.out.println(firstHero);
         
    }
}