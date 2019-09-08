package Charactor;

public class ADHero extends Hero {
	
	public ADHero() {
		
	}
	
	public ADHero(String name) {
		
		this.name = name;
	}
	
	public ADHero(String name,int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println(this.name);
		
	}
	
	public ADHero(String name , int hp,int armor,int moveSpeed) {
		
		//调用构造方法
		this(name,hp);
		
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		
	}
	
	public static void main(String[] args) {
		ADHero h = new ADHero("ADHero",1000,300,100);
		
	}

}
