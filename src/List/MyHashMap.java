package List;

import java.util.LinkedList;


public class MyHashMap implements IHashMap {	
	
	LinkedList<Entry> values[] = new LinkedList[2000];     
	
	public void put(String key,Object object) {
		//获取hashcode
		int hashcode = hashcode(key);
		
		LinkedList<Entry> list = values[hashcode];
		
		if(null==list) {
			list = new LinkedList<>();
			values[hashcode] = list;
		}
		
		boolean found = false;
		//判断是否存在键值对
		for (Entry entry : list) {
			//如果存在，则把原值覆盖
			if(key.equals(entry.key)) {
				entry.value=object;				
				found=true;
				break;
			}
		}
		//如果不存在键值对，则新建一个	
		if(!found) {
			Entry entry = new Entry(key, object);
			list.add(entry);
		}	
			
	}
	
	public Object get(String key) {
		
		int hashcode = hashcode(key);
		
		LinkedList<Entry> list = values[hashcode];
		
		//判断是否为空
		if(null==list)
			return null;
		
		Object result = null;
			//判断key是否相同
		for (Entry entry : list) {
			if(entry.key.equals(key)) {
				result=entry.value;
			    break;
			}
		}
		
		return result;
		
	}
	
	//获取hashcode
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
	        //取绝对值
	        hashcode = hashcode<0 ? 0-hashcode:hashcode;
	        //落在0-1999之间
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
