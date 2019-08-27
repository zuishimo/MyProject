package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ChineseProblem { 
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		File f = new File("D:/3d/hao.txt");
		byte bs[] = new byte[2];
		bs[0] = (byte)0xd6;
		bs[1] = (byte)0xd2;
		String str  =new String(bs,"GBK");
        System.out.println("D6 D0 对应的编码是："+str);
        
        
		
        try(FileOutputStream fos = new FileOutputStream(f)) {
        	
			fos.write(bs);
        	
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
