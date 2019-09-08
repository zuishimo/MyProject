package Multithreading;

import Charactor.Hero;

public class TestThread {

	public static void main(String[] args) {
		
		Hero galen = new Hero();
		galen.name = "¸ÇÂ×";
		galen.hp = 1000;
		galen.damage = 61;
		
		Hero teemo = new Hero();
		teemo.name = "ÌáÄª";
		teemo.hp = 500;
		teemo.damage = 150;
		
		Hero bh = new Hero();
        bh.name = "ÉÍ½ðÁÔÈË";
        bh.hp = 500;
        bh.damage = 65;
         
        Hero leesin = new Hero();
        leesin.name = "Ã¤É®";
        leesin.hp = 455;
        leesin.damage = 80;
        
//        KillThread killThread1 = new KillThread(teemo, galen);
//        killThread1.start();
//        KillThread killThread2 = new KillThread(bh, leesin);
//        killThread2.start();
        
//        Battle battle1 = new Battle(galen,teemo);
//        
//        new Thread(battle1).start();
// 
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();
        
        Thread thread1 = new Thread() {
        	
        	public void run() {
        		while(!galen.isDead())
        			teemo.attackHero(galen);
        	}
        	
        };
        thread1.start();
        
        Thread thread2 = new Thread() {
        	public void run() {
        		while(!bh.isDead())
        			leesin.attackHero(bh);
        	}
        };
        thread2.start();
 
	}
}
