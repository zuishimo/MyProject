package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ErgodicDirectory {

	public static void main(String[] args)throws IOException {
		
		File srcFolder = new File("D:/3d");
		
		
		//调用遍历文件夹方法
		ergodic(srcFolder);
	}
	
	public static void ergodic(File srcFile)throws IOException {
		
		//以字符串数组的形式获取文件夹下的所有文件
		File file[] = srcFile.listFiles();
		
		for (int i = 0; i < file.length; i++) {

			if(file[i].isDirectory()) {
				String str = file[i].getAbsolutePath();
				File srcFile2 = new File(str);
				ergodic(srcFile2);
			}
			
			else {
				String str = file[i].getAbsolutePath();
				str = str.replaceFirst("3d", "3d1");
				File destFile = new File(str);
				destFile.getParentFile().mkdirs();
				copyFile(file[i],destFile);
			}
		}
	}
	
	public static void copyFile(File file,File destFile) {
		
		try(
			
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(destFile);
				
			) {
			
			
			byte b[] = new byte[(int)file.length()];
			fis.read(b);
			
			fos.write(b);
			fos.flush();
					
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
