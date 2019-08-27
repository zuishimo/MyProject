package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferStream {

	public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("D:/3d/hao.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                FileWriter fr = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fr);
            )
        {
            for (int i = 0; i < 3; i++) {
				
            	pw.println("饮时歌");
            	pw.flush();
			}
                
            
                
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
