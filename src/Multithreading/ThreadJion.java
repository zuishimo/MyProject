package Multithreading;
import java.io.IOException;

import Charactor.*;

public class ThreadJion {

	public static void main(String[] args) {
		
		final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;
  
        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
          
        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;
          
        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;
        
        Thread t1 = new Thread() {
        	
        	public void run() {
        		while(!teemo.isDead())
        			gareen.attackHero(teemo);
        	}
        	
        };
        
        t1.start();
        //�������е����һֱ�����߳�������
        try {
        	//t1���뵽���߳��У�ֻ�еȵ�t1�߳�ִ�н���֮�����ִ��t2�߳�
			t1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
        //��۲쵽���װ���Īɱ���󣬲�����t2�߳�
        t2.start();
		
	}
	
}
