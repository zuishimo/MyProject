package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestHero extends Hero {
	
	public static void main(String[] args) {
		//Ҫ��Hero����ֱ�ӱ������ļ��ϣ������Hero��ʵ��Serializable�ӿ�
		Hero array[] = new Hero[10];
		for (int j = 0; j < 10; j++) {
			
			array[j] = new Hero("��ʱħ��" + j);
		}
		
		File f = new File("D:/3d/galen.lol");
		
		try(
			
				//�����
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//������
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
			) {
			
			oos.writeObject(array);
			Hero h2[] = (Hero[])ois.readObject();
			
			for (Hero hero : array) {
				System.out.println(hero.name);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch(ClassNotFoundException d) {
			d.printStackTrace();
		}
		
	}
	
}
