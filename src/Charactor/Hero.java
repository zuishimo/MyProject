package Charactor;
import java.io.Serializable;
public class Hero implements Comparable<Hero> {
	
	public String name;
	public int hp;
	public int damage;
	int armor;
	int moveSpeed;
	
	public Hero() {
		
	}
	
	public Hero(String name) {
		
		this.name = name;
	}
	
	public Hero(String name,int hp,int damage) {
		this.name=name;
		this.hp=hp;
		this.damage=damage;
	}
	
	public int compareTo(Hero anotherHero) {
		return hp-anotherHero.hp;
	}
	
	public boolean matched() {
		return this.hp>100&&this.damage<50;
	}
	
	 public int compareHero(Hero h) {
		 return hp >= h.hp ? 1:-1;
	 }
	
	public String toString() {
		
		return "[Name: " + name + ", HP：" + hp +  ", Damage:" + damage  + " ]\r\n";
	}
	
	public void attackHero(Hero h) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s正在攻击%s,%s的血变成了%d%n",name,h.name,h.name,h.hp);
		
		if(h.isDead()) {
			System.out.println(h.name + "死了");
		}
	}
	
	public boolean isDead() {
        return 0>=hp?true:false;
    }
	int totalTime = 3;
	 
    public void adugen() {
        while (true) {
            for (int i = 0; i < totalTime; i++) {
                System.out.printf("波动拳第%d发%n", i + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
 
            System.out.println("开始为时5秒的充能");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
    }

}
