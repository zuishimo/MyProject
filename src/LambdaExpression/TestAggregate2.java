package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Charactor.Hero;

public class TestAggregate2 {

	public static void main(String[] args) {
		
		List<Hero> list = new ArrayList<Hero>();
		
		//����
		int total = 10;
		System.out.println("��ʼ��10��Ӣ�ۣ�");
		for (int i = 0; i < total; i++) {	
			int hp = (int)(Math.random()*1000);
			int damage = (int)(Math.random()*300);			
			list.add(new Hero("hero" + i,hp,damage));	
		}
		System.out.println("��ʼ�����");
		Collections.sort(list,TestAggregate2::compare);          //������������
		System.out.println(list);
		
		System.out.println("��ͳɸѡ��");
		traditionFilter(list);
		System.out.println("�ۺ�ɸѡ��");
		aggregateFilter(list);
		
	}
	
	public static int compare(Hero h1,Hero h2) {
		return h1.hp>=h2.hp ? 1:-1;
	}
	
	//��ͳ��ʽɸѡ
	public static void traditionFilter(List<Hero> list) {
		System.out.println(list.get(2));
	}
	
	public static void aggregateFilter(List<Hero> list) {
	Hero s = list
		.stream()
		.skip(2)
		.findFirst()
		.get();
	System.out.println(s);
	}
}
