package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestHero extends Hero {
	
	public static void main(String[] args) {
		//要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
		Hero array[] = new Hero[10];
		for (int j = 0; j < 10; j++) {
			
			array[j] = new Hero("醉时魔：" + j);
		}
		
		File f = new File("D:/3d/galen.lol");
		
		try(
			
				//输出流
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//输入流
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
