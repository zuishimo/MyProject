package generic;
import java.util.ArrayList;

import java.util.List;

import Charactor.*;
public class Node<T extends Comparable<T>> {

	 // ���ӽڵ�
    public Node<T> leftNode;
    // ���ӽڵ�
    public Node<T> rightNode;
  
    // ֵ
    public T value;
  
    // ���� ����
    public void add(T v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value)
            value = v;
  
        // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
             
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new Node<T>();
                leftNode.add(v);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode)
                    rightNode = new Node<T>();
                rightNode.add(v);
            }
  
        }
  
    }
  
 // ����������еĽڵ�
    public List<T> values() {
        List<T> values = new ArrayList<>();
  
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
  
        // ��ǰ�ڵ�
        values.add(value);
  
        // �ҽڵ�ı������
        if (null != rightNode)
  
            values.addAll(rightNode.values());
  
        return values;
    }
  
    public static void main(String[] args) {
  
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
  
        Node<Integer> roots = new Node<Integer>();
        Node<Hero> h = new Node<Hero>();
        //û��ʵ��comparable�ӿڣ�������ΪNode�ķ���
        for (int number : randoms) {
            roots.add(number);
        }
  
        System.out.println(roots.values());
  
    }
}
