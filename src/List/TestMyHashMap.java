package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMyHashMap extends MyHashMap {

	public static void main(String[] args) {
		
		System.out.println("正在初始化10万个Hero对象------");
		List<Hero> forList = new ArrayList<Hero>();
		int total = 10*10000;      //总数
		for (int i = 0; i < total; i++) {
			int model = (int)(Math.random()*10000);
			forList.add(new Hero("醉时魔-" + model));
		}
		
		System.out.println("初始化完成");
		
		//用于保存相同的Hero
		List<Hero> temp = new LinkedList<Hero>();
		//计算开始时间
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			if("醉时魔-5555".equals(forList.get(i).name))
				temp.add(forList.get(i));
		}
		//计算结束时间
		long end = System.currentTimeMillis();
		System.out.printf("总共找到%d个英雄，for循环查找耗时%d毫秒",temp.size(),end-start);
		
		System.out.println();
		
		//先把Hero存进MyHashMap中
		MyHashMap hashMap = new MyHashMap();
		for (Hero hero : forList) {
			List<Hero> list= (List<Hero>) hashMap.get( hero.name);
            if(list==null){
                list = new ArrayList<>();
                hashMap.put(hero.name, list);
            }
            list.add(hero);
		}
		//计算开始时间
		start = System.currentTimeMillis();
		
		List <Hero>result= (List<Hero>) hashMap.get("醉时魔-5555");
		
		//计算结束时间
		end = System.currentTimeMillis();
		
		System.out.printf("总共找到%d个英雄，MyHashMap键值对查找法耗时%d毫秒",result.size(),end-start);
	}
	
}
