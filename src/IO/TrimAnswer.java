package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TrimAnswer {

	public static void main(String[] args)throws FileNotFoundException {
		File f1 = new File("D:/3d/BufferStream.java");
		File f2 = new File("D:/3d/hao.txt");
		
		try(
				//�ַ�������
				FileReader fr = new FileReader(f1);
		        //�����ַ���������������
				BufferedReader br = new BufferedReader(fr);
				//�����ַ������д������
				PrintWriter pw = new PrintWriter(f2);
				
		) {
			while(true) {
				
				String line = br.readLine();
					
					//�ж��Ƿ���ע��
					if(line.contains("//"))
						continue;
					else
						pw.println(line);				
				
				if(null==line)
					break;
			}	
		} 
		catch (IOException e) {
			// TODO: handle exception
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	
	
}
