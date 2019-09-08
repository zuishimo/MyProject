package LambdaExpression;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
 
public class TestAggregate {
 
    public static void main(String[] args) {
        Random r = new Random();
        List<HeroCopy> heros = new ArrayList<HeroCopy>();
        for (int i = 0; i < 5; i++) {
            heros.add(new HeroCopy("hero " + i, r.nextInt(1000), r.nextInt(200)));
        }
        //制造一个重复的数据
        heros.add(heros.get(0));
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        
        System.out.println("筛选出符合条件hp>100&&damage<50的数据：");
        heros
        .stream()
        .filter(h -> h.hp>100 && h.damage<50)
        .forEach(h -> System.out.print(h));
        
        System.out.println("去除重复的数据：");
        heros
        .stream()
        .distinct()
        .forEach(h -> System.out.print(h));
        
        System.out.println("按照血量排行：");
        heros
        .stream()
        .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
        .forEach(h->System.out.print(h));
        
        System.out.println("保留前3个数据：");
        heros
        .stream()
        .limit(3)
        .forEach(h -> System.out.print(h));
        
        System.out.println("忽略前3个数据：");
        heros
        .stream()
        .skip(3)
        .forEach(h -> System.out.print(h));
        
        System.out.println("转换为double类型的Stream：");
        heros
        .stream()
        .mapToDouble(HeroCopy::getHp)
        .forEach(h -> System.out.println(h));
        
        System.out.println("转换为任意类型的Stream：");
        heros
        .stream()
        .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
        .forEach(h->System.out.println(h));  
    }
}