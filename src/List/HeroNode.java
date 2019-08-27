package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeroNode extends Hero {
	
	//����
	public HeroNode leftNode;

	//�ҽ��
	public HeroNode rightNode;
	
	//��ǰ����ֵ
	public Hero value;
	
	//Ӣ��Ѫ��
	public int HP;
	
	public static void main(String[] args) {
		
		HeroNode roots = new HeroNode();
		
		System.out.println("��ʼ��10��Hero:");
		for (int i = 0; i < 10; i++) {
			int tempHP = (int)(Math.random()*1000);
			Hero h = roots.addNode(new Hero("Name:teemo" + i + "  HP:" + tempHP));
			System.out.print(h + ",  ");
		}
        System.out.println();
	 
	}
	
	//����������
	public Hero addNode(Hero v) {
		if(null==value) {
			value = v;
		    value.hp = Integer.parseInt(v.name.substring(16));
		}
		else {
			if(value.hp<Integer.parseInt(v.name.substring(16))) {
				if(null==leftNode)
				  leftNode = new HeroNode();
				leftNode.addNode(v);
			}
			
			else if(value.hp>=Integer.parseInt(v.name.substring(16))) {
				if(null==rightNode)
				  rightNode = new HeroNode();
				rightNode.addNode(v);
			}
		}

		return v;
		
	}
	
	
	//���������Hero
	public List<Hero> sort() {
		List<Hero> list = new ArrayList<Hero>();
		if(leftNode != null)
			list.addAll(leftNode.sort());
		
		list.add(value);
		
		if(rightNode != null)
			list.addAll(rightNode.sort());
		
		
		return list;
	}
	
}
