package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test {

	public static void main(String[] args)throws UnsupportedEncodingException,FileNotFoundException {
		
		File f = new File("D:/3d/hao.txt");
		
		//FileReader读取的是字符，所以一定是根据某种编码把字节识别成了字符
		//FileReader使用的编码方式可以通过Charset.defaultChartset方法获取
		try(FileReader fr = new FileReader(f)) {
			char b[] = new char[(int)f.length()];
			fr.read(b);
			System.out.println(new String(b));
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		//由于FileReader无法手动设置编码方式，所以只能使用InputStreamReader来代替
		//InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"));
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
			char c[] = new char[(int)f.length()];
			isr.read(c);
			//调用trim方法去除UTF-8编码的标示符
			trim(c);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	public static void trim(char c[]) {
		char ache[] = new char[c.length-1];
		System.arraycopy(c, 1, ache, 0, ache.length);
		
		System.out.println(new String(ache));
	}
	
}
