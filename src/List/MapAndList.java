package List;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapAndList {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("adc", "����Ӣ��");
		map.put("apc", "ħ��Ӣ��");
		map.put("t", "̹��");
		
		reverse(map);
	}
	
	public static void reverse(HashMap<String, String> map) {
		HashMap<String, String> temp = new HashMap<String, String>();
		for (String key : map.keySet()) {		
			temp.put(map.get(key), key);			
		}
		map=temp;
		System.out.println(map);
	}
}
