package List;

import java.util.LinkedList;


public class MyHashMap implements IHashMap {	
	
	LinkedList<Entry> values[] = new LinkedList[2000];     
	
	public void put(String key,Object object) {
		//��ȡhashcode
		int hashcode = hashcode(key);
		
		LinkedList<Entry> list = values[hashcode];
		
		if(null==list) {
			list = new LinkedList<>();
			values[hashcode] = list;
		}
		
		boolean found = false;
		//�ж��Ƿ���ڼ�ֵ��
		for (Entry entry : list) {
			//������ڣ����ԭֵ����
			if(key.equals(entry.key)) {
				entry.value=object;				
				found=true;
				break;
			}
		}
		//��������ڼ�ֵ�ԣ����½�һ��	
		if(!found) {
			Entry entry = new Entry(key, object);
			list.add(entry);
		}	
			
	}
	
	public Object get(String key) {
		
		int hashcode = hashcode(key);
		
		LinkedList<Entry> list = values[hashcode];
		
		//�ж��Ƿ�Ϊ��
		if(null==list)
			return null;
		
		Object result = null;
			//�ж�key�Ƿ���ͬ
		for (Entry entry : list) {
			if(entry.key.equals(key)) {
				result=entry.value;
			    break;
			}
		}
		
		return result;
		
	}
	
	//��ȡhashcode
	 private static int hashcode(String str) {
	        // TODO Auto-generated method stub
	        if(0==str.length())
	            return 0;
	         
	        int hashcode = 0;
	        char[]cs= str.toCharArray();
	        for (int i = 0; i < cs.length; i++) {
	            hashcode +=cs[i];
	        }
	        hashcode *=23;
	        //ȡ����ֵ
	        hashcode = hashcode<0 ? 0-hashcode:hashcode;
	        //����0-1999֮��
	        hashcode %=2000;
	         
	        return hashcode;
	    }
	
	public String toString() {
        LinkedList<Entry> result = new LinkedList();
 
        for (LinkedList<Entry> linkedList : values) {
            if (null == linkedList)
                continue;
            result.addAll(linkedList);
        }
        return result.toString();
    }
	
}
