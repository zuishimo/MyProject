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
		
		float total = 1000000;       //混淆的次数
		int sum=0;      //统计出现的次数
		for (int i = 0; i < total; i++) {
			
			Collections.shuffle(num);
			if(num.get(0)==3 & num.get(1) == 1 & num.get(2) == 4)
				sum +=1;
		}
		
		float probability = sum/total;
		System.out.printf("概率为： %f ",probability );
		
		
	}
	
}
