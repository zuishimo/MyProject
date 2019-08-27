package NumberAndString;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuffer implements Buffer {
	
	//用集合列表来存放字符
	ArrayList capacity;
	
	public MyStringBuffer() {
		capacity = new ArrayList();
	}
	
	public MyStringBuffer(String str) {
		this();
		if(null==str)
			return;
		char ch[] = str.toCharArray();
		for (char c : ch) {
			capacity.add(c);
		}
	}
	
	public static void main(String[] args) {		
		
	}

	public void append(String str) {
		if(null==str)
			return;
		insert(capacity.size(),str);		
	}
	
	public void append(char ch) {
		append(String.valueOf(ch));		
	}
	
	public void delete(int dest,int end) {
		if(dest>end)
			return;
		else if(dest<0||dest>capacity.size())
			return;
		else if(end<0||end>capacity.size())
			return;
		
		for (int i = dest; i < end; i++) {
			capacity.remove(i);
		}
		
	}
	public void delete(int dest) {
		delete(dest,capacity.size());
	}
	
	public void insert(int dest,String str) {

		if(dest<0||dest>capacity.size())
			return;
		if(null==str)
			return;
		char ch[] = str.toCharArray();
		for (int i = dest; i < dest+ch.length; i++) {
			capacity.add(ch[i]);
		}
	}
	
	public void insert(int dest,char ch) {
		insert(dest,String.valueOf(ch));
	}
	
	public int length() {
		return capacity.size();
	}
	
	public String tosString() {
		char capacityValue[] = new char[capacity.size()];
		for (int i = 0; i < capacityValue.length; i++) {
			capacityValue[i] = (char)capacity.get(i);
		}
		return new String(capacityValue);
	}
	
}
