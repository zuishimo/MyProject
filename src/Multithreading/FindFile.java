package Multithreading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {

	public static void search(File f,String name) {
		if(f.isFile()) {
			if(f.getName().toLowerCase().endsWith(".java")){
                //当找到.java文件的时候，就启动一个线程，进行专门的查找
				
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
