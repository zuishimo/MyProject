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
	            //ͨ�����ֵʵ����hero��hp��damage
	            heros.add(new Hero("hero "+ i, r.nextInt(400), r.nextInt(200)));
	        }
	        System.out.println("��ʼ����ļ��ϣ�");
	        System.out.println(heros);

	        //��Lambda�е��þ�̬����
//	        Collections.sort(heros,(h1,h2) -> StaticMethod.compare(h1, h2));
//	        Collections.sort(heros,StaticMethod::compare);
	        
	        //��Lambda�е��������еĶ���ķ���
//	        Comparator<Hero> c = (h1,h2)-> h1.compareHero(h2) ;
//	        Collections.sort(heros,c);
//	        System.out.println(heros);
	        Collections.sort(heros,Hero::compareHero);
	        
	        
	        System.out.println("����Ѫ�������ļ��ϣ�");
	        System.out.println(heros);
	    }
	 
	 public static int compare(Hero h1,Hero h2) {
		 return h1.hp >= h2.hp ? 1:-1;
	 }
	
}
