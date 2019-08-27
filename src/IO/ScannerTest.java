package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		File f = new File("D:/3d/Java.txt");
		
		//��ȡ��ģ��
		readFile(f);
	}
	
	public static void readFile(File f) {
		
		try(
			
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
			) {			
			//���ô�������
			createClass(br);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	public static void createClass(BufferedReader br) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ƣ�");
		String className = sc.next();
		System.out.println("�������������ͣ�");
		String propertiesType = sc.next();
		System.out.println("�������������ƣ�");
		String propertiesName = sc.next();
		
		try(br) {
		   while(true) {
				String line = br.readLine();
				if(null==line)
					break;
				
				if(line.contains("@class@")) {
					line =line.replaceAll("@class@", className);
				}
				
				if(line.contains("@type@")) {
					line=line.replaceAll("@type@", propertiesType);
				}	
				
				if(line.contains("@property@")) {
					line=line.replaceAll("@property@", propertiesName);
				}
				if(line.contains("@Uproperty@")) {
					line=line.replaceAll("@Uproperty@", propertiesName);
				}
				System.out.println(line);
		   }	
		} catch (IOException e) {
				// TODO: handle exception
		}	
		
	}
	
}
