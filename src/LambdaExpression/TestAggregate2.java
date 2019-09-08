package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Charactor.Hero;

public class TestAggregate2 {

	public static void main(String[] args) {
		
		List<Hero> list = new ArrayList<Hero>();
		
		//总数
		int total = 10;
		System.out.println("初始化10个英雄：");
		for (int i = 0; i < total; i++) {	
			int hp = (int)(Math.random()*1000);
			int damage = (int)(Math.random()*300);			
			list.add(new Hero("hero" + i,hp,damage));	
		}
		System.out.println("初始化完成");
		Collections.sort(list,TestAggregate2::compare);          //进行升序排序
		System.out.println(list);
		
		System.out.println("传统筛选：");
		traditionFilter(list);
		System.out.println("聚合筛选：");
		aggregateFilter(list);
		
	}
	
	public static int compare(Hero h1,Hero h2) {
		return h1.hp>=h2.hp ? 1:-1;
	}
	
	//传统方式筛选
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
