package IO;

import java.io.Serializable;

public class Hero implements Serializable {

	 //��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
    
    public Hero() {
    	
    }
    
    public Hero(String str) {
    	this.name = str;
    }
    
    public static void main(String[] args) {
		Hero h = new Hero();

	}
}
