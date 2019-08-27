package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {

	public static void main(String[] args) {
		
		int total = 3000000;
		
		List<Hero> list = new ArrayList<Hero>();		
		System.out.println("初始化一个长度是" + total + "的随机英雄集合");
		for (int i = 0; i < total; i++) {
			int random = (int)(Math.random()*10000);
			list.add(new Hero("醉时魔" + random));
			
		}
		
		//名字作为Key，名字相同的放在一个list集合容器里
		HashMap<String, List<Hero>> map = new HashMap<String, List<Hero>>();
		for (Hero hero : list) {
			List<Hero> heros = map.get(hero.name);
			if(null==heros) {
				heros = new ArrayList<Hero>();
				map.put(hero.name, heros);
			}
			heros.add(hero);			
		}
		
		System.out.println("初始化完成");
		
		//for循环查找法
		List<Hero> forSave = selectMethod(new SerachByFor (list),"For循环查找法");
		List<Hero> hashMapSave = selectMethod(new SerachByHashMap (map),"HashMap查找法");
		
	}
	
	//查找接口
	interface Serach{
		public void serachObject();
		public List<Hero> values();
	}
	
	
	public static List<Hero> selectMethod(Serach object,String Method) {
		long start = System.currentTimeMillis();
		object.serachObject();
		List<Hero> temp = object.values();
		long end = System.currentTimeMillis();
		System.out.printf("找到%d个英雄，%s一共耗时%d毫秒%n",temp.size(),Method,end-start);
		return temp;
	}
	
	
	//for循环查找
	public static class SerachByFor implements Serach{
		
		List<Hero> list;
		
		public SerachByFor(List<Hero> list) {
			this.list = list;
		}

		//用于保存相同的英雄
		List<Hero> temp = new ArrayList<Hero>();
		
		public void serachObject() {
			
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).name.contains("5555"))
					temp.add(list.get(i));
			}

		}
		
		public List<Hero>  values(){
			return temp;
		}
	}
	
	
	//HashMap查找
	public static class SerachByHashMap implements Serach{
		
		HashMap<String, List<Hero>> list;
		
		public SerachByHashMap(HashMap<String, List<Hero>> list) {	
			this.list = list;
		}
		
		//用于保存相同的英雄
		List<Hero> temp = new ArrayList<Hero>();
		
		public void serachObject() {
			
			temp = list.get("醉时魔5555");
		}
		
		public List<Hero>  values(){
			return temp;
		}
	}
	

  
}
