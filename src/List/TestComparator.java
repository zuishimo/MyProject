package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TestComparator {

	public static void main(String[] args) {
		Random r = new Random();
		List<SurperMan> surperMan = new ArrayList<SurperMan>();
		

		for (int i = 0; i < 10; i++) {
			//ͨ���������ʼsurperman��ʵ������
  		surperMan.add(new SurperMan("����" + i, r.nextInt(1500), r.nextInt(100)));
			
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(surperMan);
		
		
		
		Collections.sort(surperMan);
		System.out.println("����Ѫ�������");
		System.out.println(surperMan);
	}
	
}
