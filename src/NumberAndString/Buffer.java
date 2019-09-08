package NumberAndString;

public interface Buffer {

	public void append(String str);
	public void append(char ch);
	public void delete(int dest);
	public void delete(int start,int end);
	public void insert(int dest,String str);
	public void insert(int dest,char ch);
	
}
