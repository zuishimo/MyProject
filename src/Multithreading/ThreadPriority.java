package Multithreading;
import Charactor.*;

public class ThreadPriority {

	public static void main(String[] args) {
		final Hero gareen = new Hero();
        gareen.name = "¸ÇÂ×";
        gareen.hp = 6160;
        gareen.damage = 5;
  
        final Hero teemo = new Hero();
        teemo.name = "ÌáÄª";
        teemo.hp = 3000;
        teemo.damage = 5;
          
        final Hero bh = new Hero();
        bh.name = "ÉÍ½ðÁÔÈË";
        bh.hp = 5000;
        bh.damage = 5;
          
        final Hero leesin = new Hero();
        leesin.name = "Ã¤É®";
        leesin.hp = 4505;
        leesin.damage = 5;
        
        Thread t1 = new Thread() {
        	public void run() {
        		while(!gareen.isDead())
        			teemo.attackHero(gareen);
        	}
        	
        };
        Thread t2 = new Thread() {
        	public void run() {
        		while(!bh.isDead())
        			leesin.attackHero(bh);
        	}
        	
        };
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        
	}
	
}
