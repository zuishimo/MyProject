package LambdaExpression;
      
public class HeroCopy implements Comparable<HeroCopy>{
    public String name;
    public float hp;
         
    public int damage;
         
    public HeroCopy(){
            
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public HeroCopy(String name) {
        this.name =name;
    }
    //��ʼ��name,hp,damage�Ĺ��췽��
    public HeroCopy(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }
    
    @Override
    public int compareTo(HeroCopy anotherHero) {
        if(damage<anotherHero.damage)
            return 1; 
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
 
}