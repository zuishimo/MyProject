package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMyHashMap extends MyHashMap {

	public static void main(String[] args) {
		
		System.out.println("���ڳ�ʼ��10���Hero����------");
		List<Hero> forList = new ArrayList<Hero>();
		int total = 10*10000;      //����
		for (int i = 0; i < total; i++) {
			int model = (int)(Math.random()*10000);
			forList.add(new Hero("��ʱħ-" + model));
		}
		
		System.out.println("��ʼ�����");
		
		//���ڱ�����ͬ��Hero
		List<Hero> temp = new LinkedList<Hero>();
		//���㿪ʼʱ��
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			if("��ʱħ-5555".equals(forList.get(i).name))
				temp.add(forList.get(i));
		}
		//�������ʱ��
		long end = System.currentTimeMillis();
		System.out.printf("�ܹ��ҵ�%d��Ӣ�ۣ�forѭ�����Һ�ʱ%d����",temp.size(),end-start);
		
		System.out.println();
		
		//�Ȱ�Hero���MyHashMap��
		MyHashMap hashMap = new MyHashMap();
		for (Hero hero : forList) {
			List<Hero> list= (List<Hero>) hashMap.get( hero.name);
            if(list==null){
                list = new ArrayList<>();
                hashMap.put(hero.name, list);
            }
            list.add(hero);
		}
		//���㿪ʼʱ��
		start = System.currentTimeMillis();
		
		List <Hero>result= (List<Hero>) hashMap.get("��ʱħ-5555");
		
		//�������ʱ��
		end = System.currentTimeMillis();
		
		System.out.printf("�ܹ��ҵ�%d��Ӣ�ۣ�MyHashMap��ֵ�Բ��ҷ���ʱ%d����",result.size(),end-start);
	}
	
}
