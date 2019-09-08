package LambdaExpression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
  
public class TestCollection {
    public static void main(String[] args) {
    	
        insertFirst(ArrayList::new, "ArrayList");
        insertFirst(LinkedList::new, "LinkedList");
  
    }
  
    private static void insertFirst(Supplier<List> s, String type) {
        int total = 1000 * 100;
        final int number = 5;
        List list = s.get();
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            list.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
  
}
