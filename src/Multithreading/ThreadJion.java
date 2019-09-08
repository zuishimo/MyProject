package Multithreading;
import java.io.IOException;

import Charactor.*;

public class ThreadJion {

	public static void main(String[] args) {
		
		final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;
  
        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;
          
        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;
          
        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;
        
        Thread t1 = new Thread() {
        	
        	public void run() {
        		while(!teemo.isDead())
        			gareen.attackHero(teemo);
        	}
        	
        };
        
        t1.start();
        //代码运行到这里，一直是主线程在运行
        try {
        	//t1加入到主线程中，只有等到t1线程执行结束之后才能执行t2线程
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
        //会观察到盖伦把提莫杀掉后，才运行t2线程
        t2.start();
		
	}
	
}
