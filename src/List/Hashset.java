package List;

import java.util.HashSet;

public class Hashset {
	
	static String randomStr = "";
	public static void main(String[] args) {
		//���ڴ�ȡ����ַ���
		HashSet<String> str = new HashSet<String>();
		
		//���ڴ�ȡ��ͬ���ַ���
		HashSet<String> equalStr = new HashSet<String>();
		
		//����ַ�������
		randomContent();
		
		//����ַ���HashSet,����¼��ͬ���ַ���
		for (int i = 0; i < 100; i++) {
			String temp = randomFill();
			if(str.contains(temp))
			equalStr.add(temp);
			str.add(temp);
		}

		if(equalStr.size()==0)
			System.out.println("����ͬ�ַ���");
		else
		System.out.println("��ͬ���ַ���������ʾ��" + equalStr);
		
	}
	
	public static void randomContent() {

		for (int i = 48; i < 58; i++) {
			randomStr +=(char)i;
		}
		for (int i = 65; i < 91; i++) {
			randomStr +=(char)i;
		}
		for (int i = 97; i < 123; i++) {
			randomStr +=(char)i;
		}

	}
	
	
	public static String randomFill() {
		int charFirst = (int)(Math.random()*randomStr.length());
		int charSecond= (int)(Math.random()*randomStr.length());
		
		String temp = String.valueOf(randomStr.charAt(charFirst)) + String.valueOf(randomStr.charAt(charSecond));
		return temp;
	}
}
