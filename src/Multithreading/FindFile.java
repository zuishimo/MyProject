package Multithreading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {

	public static void search(File f,String name) {
		if(f.isFile()) {
			if(f.getName().toLowerCase().endsWith(".java")){
                //���ҵ�.java�ļ���ʱ�򣬾�����һ���̣߳�����ר�ŵĲ���
				
                new SearchFileThread(f,name).start();
            }
		}
		
		else if(f.isDirectory()) {
			File fs[] = f.listFiles();
			for (File file : fs) {
				search(file, name);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		File f = new File("D:/3d");		
		search(f,"B");
	}
}
