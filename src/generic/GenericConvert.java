package generic;
import java.util.ArrayList;

import Charactor.*;

public class GenericConvert {

	public static void main(String[] args) {
		
		ADHero teemo = new ADHero("��Ī");
		
		Hero hero = teemo;
		System.out.println(hero);
		
		ArrayList<Hero> heroCopy = new ArrayList<Hero>();
		ArrayList<ADHero> adhero = new ArrayList<ADHero>();
		
		
		//�޷�ת���ɹ�����Ϊ����ܳɹ��Ļ������൱��hero�������ָ����һ��ADHero��
		//�������������ת���ɹ��Ļ������൱����һ��ADHero�������п��Է�APHero������ì��
//		heroCopy = adhero;
		
		
	}
	
}
