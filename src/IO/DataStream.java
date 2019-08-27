package IO;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataStream {

	public static void main(String[] args)throws NullPointerException,FileNotFoundException {
		File f =new File("D:/3d/DataStream.txt");
		
		//������
		bufferWrite(f);
		bufferRead(f);
		
		
		//������
//		dataWrite(f);
//		dataRead(f);
	}
	
	
	public static void dataWrite(File f) {
		
		try(
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
						
			) {
			
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeUTF("��ʱħ");
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	public static void dataRead(File f) {
		
		try(
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
				
		   ) {
			
			System.out.printf("��ȡ����ֵ��%s%n",dis.readBoolean());
			System.out.printf("��ȡ����ֵ��%d%n",dis.readInt());
			System.out.printf("��ȡ�ַ�����%s%n",dis.readUTF());
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	public static void bufferWrite(File f) {
		
		try(
			   FileWriter fos = new FileWriter(f);
			   PrintWriter pw = new PrintWriter(fos);
				
			) {
			
			pw.println("12");
			pw.println("21");
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void bufferRead(File f) {
		
		try(
			
				FileReader fis =new FileReader(f);
				BufferedReader br = new BufferedReader(fis);
				
			) {
			
			while(true) {
				String line = br.readLine();
				if(null==line)
					break;
				System.out.printf("�ַ�������%s ת��Ϊ��������%d%n",line,Integer.parseInt(line));
				
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
		
}
