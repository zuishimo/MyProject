package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferStream {

	public static void main(String[] args) {
        // ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("D:/3d/hao.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
        try (
                FileWriter fr = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fr);
            )
        {
            for (int i = 0; i < 3; i++) {
				
            	pw.println("��ʱ��");
            	pw.flush();
			}
                
            
                
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
