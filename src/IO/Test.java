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
		
		//FileReader��ȡ�����ַ�������һ���Ǹ���ĳ�ֱ�����ֽ�ʶ������ַ�
		//FileReaderʹ�õı��뷽ʽ����ͨ��Charset.defaultChartset������ȡ
		try(FileReader fr = new FileReader(f)) {
			char b[] = new char[(int)f.length()];
			fr.read(b);
			System.out.println(new String(b));
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		//����FileReader�޷��ֶ����ñ��뷽ʽ������ֻ��ʹ��InputStreamReader������
		//InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"));
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
			char c[] = new char[(int)f.length()];
			isr.read(c);
			//����trim����ȥ��UTF-8����ı�ʾ��
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
