package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {

	public static void main(String[] args) {
		
		int total = 3000000;
		
		List<Hero> list = new ArrayList<Hero>();		
		System.out.println("��ʼ��һ��������" + total + "�����Ӣ�ۼ���");
		for (int i = 0; i < total; i++) {
			int random = (int)(Math.random()*10000);
			list.add(new Hero("��ʱħ" + random));
			
		}
		
		//������ΪKey��������ͬ�ķ���һ��list����������
		HashMap<String, List<Hero>> map = new HashMap<String, List<Hero>>();
		for (Hero hero : list) {
			List<Hero> heros = map.get(hero.name);
			if(null==heros) {
				heros = new ArrayList<Hero>();
				map.put(hero.name, heros);
			}
			heros.add(hero);			
		}
		
		System.out.println("��ʼ�����");
		
		//forѭ�����ҷ�
		List<Hero> forSave = selectMethod(new SerachByFor (list),"Forѭ�����ҷ�");
		List<Hero> hashMapSave = selectMethod(new SerachByHashMap (map),"HashMap���ҷ�");
		
	}
	
	//���ҽӿ�
	interface Serach{
		public void serachObject();
		public List<Hero> values();
	}
	
	
	public static List<Hero> selectMethod(Serach object,String Method) {
		long start = System.currentTimeMillis();
		object.serachObject();
		List<Hero> temp = object.values();
		long end = System.currentTimeMillis();
		System.out.printf("�ҵ�%d��Ӣ�ۣ�%sһ����ʱ%d����%n",temp.size(),Method,end-start);
		return temp;
	}
	
	
	//forѭ������
	public static class SerachByFor implements Serach{
		
		List<Hero> list;
		
		public SerachByFor(List<Hero> list) {
			this.list = list;
		}

		//���ڱ�����ͬ��Ӣ��
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
	
	
	//HashMap����
	public static class SerachByHashMap implements Serach{
		
		HashMap<String, List<Hero>> list;
		
		public SerachByHashMap(HashMap<String, List<Hero>> list) {	
			this.list = list;
		}
		
		//���ڱ�����ͬ��Ӣ��
		List<Hero> temp = new ArrayList<Hero>();
		
		public void serachObject() {
			
			temp = list.get("��ʱħ5555");
		}
		
		public List<Hero>  values(){
			return temp;
		}
	}
	

  
}
