package Multithreading;
import Charactor.*;

public class ThreadYield {

	public static void main(String[] args) {
		
		final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 61600;
        gareen.damage = 1;
  
        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 30000;
        teemo.damage = 1;
          
        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 50000;
        bh.damage = 1;
          
        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 45050;
        leesin.damage = 1;
          
        Thread t1= new Thread(){
            public void run(){
 
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    //��ʱ��ͣ��ʹ��t1����ռ��CPU��Դ
                    Thread.yield();
                     
                    bh.attackHero(leesin);
                }              
            }
        };
         
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
          
    
		
	}
}
