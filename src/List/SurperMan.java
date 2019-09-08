package List;

public class SurperMan implements Comparable<SurperMan> {

	public String name;
	public int hp;
	public int damage;
	
	public SurperMan() {
		
	}
	
	public SurperMan(String name) {
		this.name=name;
	}
	
	public SurperMan(String name,int hp,int damage) {
		this.name=name;
		this.hp=hp;
		this.damage=damage;
	}
	
	public int compareTo(SurperMan anotherSurperMan) {
	
		if(damage>anotherSurperMan.damage)
			return 1;
		else
			return -1;		
	}
	
	public String toString() {
		
		return "SurperMan [name=" + name + ", hp=" + hp + "\t, damage=" + damage + "]\r\n";
		
	}
	
}
