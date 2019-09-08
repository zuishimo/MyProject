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
        //����һ���ظ�������
        heros.add(heros.get(0));
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        
        System.out.println("ɸѡ����������hp>100&&damage<50�����ݣ�");
        heros
        .stream()
        .filter(h -> h.hp>100 && h.damage<50)
        .forEach(h -> System.out.print(h));
        
        System.out.println("ȥ���ظ������ݣ�");
        heros
        .stream()
        .distinct()
        .forEach(h -> System.out.print(h));
        
        System.out.println("����Ѫ�����У�");
        heros
        .stream()
        .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
        .forEach(h->System.out.print(h));
        
        System.out.println("����ǰ3�����ݣ�");
        heros
        .stream()
        .limit(3)
        .forEach(h -> System.out.print(h));
        
        System.out.println("����ǰ3�����ݣ�");
        heros
        .stream()
        .skip(3)
        .forEach(h -> System.out.print(h));
        
        System.out.println("ת��Ϊdouble���͵�Stream��");
        heros
        .stream()
        .mapToDouble(HeroCopy::getHp)
        .forEach(h -> System.out.println(h));
        
        System.out.println("ת��Ϊ�������͵�Stream��");
        heros
        .stream()
        .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
        .forEach(h->System.out.println(h));  
    }
}