package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			num.add(i);
			
		}
		
		float total = 1000000;       //�����Ĵ���
		int sum=0;      //ͳ�Ƴ��ֵĴ���
		for (int i = 0; i < total; i++) {
			
			Collections.shuffle(num);
			if(num.get(0)==3 & num.get(1) == 1 & num.get(2) == 4)
				sum +=1;
		}
		
		float probability = sum/total;
		System.out.printf("����Ϊ�� %f ",probability );
		
		
	}
	
}
