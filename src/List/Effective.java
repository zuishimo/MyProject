package List;

import java.util.Arrays;
import java.util.List;

public class Effective {

	public static void main(String[] args) {
		

		 //��ʼ�������
        int total = 10000;
        System.out.println("��ʼ��һ��������"+total+"��������ֵ�����");
        int[] originalNumbers = new int[total];
        for (int i = 0; i < originalNumbers.length; i++) {
            originalNumbers[i] = (int)(Math.random()*total);
        }
        System.out.println("��ʼ�����");
        System.out.println("�������ֱ���3���㷨��������");
         
        //�ӳ�ʼ���˵�������鸴�ƹ������Ա�֤��ÿһ�������㷨��Ŀ�����飬����һ����
        int[] use4sort;
         
        use4sort= Arrays.copyOf(originalNumbers, originalNumbers.length);
        int[] sortedNumbersBySelection= performance(new SelectionSort(use4sort),"ѡ��");
         
        use4sort= Arrays.copyOf(originalNumbers, originalNumbers.length);
        int[] sortedNumbersByBubbling=performance(new BubblingSort(use4sort),"ð�ݷ�");
         
        use4sort= Arrays.copyOf(originalNumbers, originalNumbers.length);
        int[] sortedNumbersByTree=performance(new TreeSort(use4sort),"������");
         
        System.out.println("�鿴���������Ƿ��ǲ�ͬ���������");
        System.out.println(sortedNumbersBySelection);
        System.out.println(sortedNumbersByBubbling);
        System.out.println(sortedNumbersByTree);
         
        System.out.println("�鿴�������������Ƿ���ͬ");
        System.out.println("�Ƚ� ѡ�� �� ð�ݷ�  ��������");
        System.out.println(Arrays.equals(sortedNumbersBySelection, sortedNumbersByBubbling));
        System.out.println("�Ƚ� ѡ�� �� ������  ��������");
        System.out.println(Arrays.equals(sortedNumbersBySelection, sortedNumbersByTree));
         
    }
     
    interface Sort{
        void sort();
        int[] values();
    }
     
    static class SelectionSort implements Sort{
 
        int numbers[];
        SelectionSort(int [] numbers){
            this.numbers = numbers;
        }
         
        @Override
        public void sort() {
            for (int j = 0; j < numbers.length-1; j++) {
                for (int i = j+1; i < numbers.length; i++) {
                    if(numbers[i]<numbers[j]){  
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }
            }
        }
 
        @Override
        public int[] values() {
            // TODO Auto-generated method stub
            return numbers;
        }
         
    }
     
    static class BubblingSort implements Sort{
        int numbers[];
        BubblingSort(int [] numbers){
            this.numbers = numbers;
        }
        @Override
        public void sort() {
            for (int j = 0; j < numbers.length; j++) {
                for (int i = 0; i < numbers.length-j-1; i++) {
                    if(numbers[i]>numbers[i+1]){  
                        int temp = numbers[i];
                        numbers[i] = numbers[i+1];
                        numbers[i+1] = temp;
                    }
                }
            }
        }
        @Override
        public int[] values() {
            // TODO Auto-generated method stub
            return numbers;
        }
         
    }
     
    static class TreeSort implements Sort{
        int numbers[];
        Node n=new Node();
         
        TreeSort(int [] numbers){
        	
            this.numbers = numbers;
        }
        @Override
        public void sort() {
         
            for (int i : numbers) {
                n.add(i);
            }
        }
        @Override
        public int[] values() {
            List<Object> list = n.values();
            int sortedNumbers[] = new int[list.size()];
            for (int i = 0; i < sortedNumbers.length; i++) {
                sortedNumbers[i] = Integer.parseInt(String.valueOf(list.get(i)));
            }
            return sortedNumbers;
        }
    }
 
    private static int[] performance(Sort algorithm, String type) {
        long start = System.currentTimeMillis();
        algorithm.sort();
        int sortedNumbers[] = algorithm.values();
        long end = System.currentTimeMillis();
        System.out.printf("%s����һ����ʱ %d ����%n",type,end-start);
        return sortedNumbers;
    }
		
}
