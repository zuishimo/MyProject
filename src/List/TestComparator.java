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
			//通过随机化初始surperman的实例变量
  		surperMan.add(new SurperMan("超人" + i, r.nextInt(1500), r.nextInt(100)));
			
		}
		System.out.println("初始化后的集合：");
		System.out.println(surperMan);
		
		
		
		Collections.sort(surperMan);
		System.out.println("根据血量排序后：");
		System.out.println(surperMan);
	}
	
}
