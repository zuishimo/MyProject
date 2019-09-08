package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndHashSet {

	public static void main(String[] args) {
		
		List<Integer> list ;
		
		list = new ArrayList<Integer>();
		insert(list,"ArrayList");
		
		list = new LinkedList<Integer>();
		insert(list,"LinkedList");
		
	}
	
	public static void insert(List<Integer> list,String type) {
		
		int total = 100*1000;
		final int num = 5;
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			list.add(list.size()/2,num);
		}
		long end = System.currentTimeMillis();
		System.out.printf("%s�ܹ�����ʱ��%d����%n",type,end-start);
	}
	
}
