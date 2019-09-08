package List;

import java.util.HashSet;

public class Hashset {
	
	static String randomStr = "";
	public static void main(String[] args) {
		//用于存取随机字符串
		HashSet<String> str = new HashSet<String>();
		
		//用于存取相同的字符串
		HashSet<String> equalStr = new HashSet<String>();
		
		//随机字符的内容
		randomContent();
		
		//随机字符填HashSet,并记录相同的字符串
		for (int i = 0; i < 100; i++) {
			String temp = randomFill();
			if(str.contains(temp))
			equalStr.add(temp);
			str.add(temp);
		}

		if(equalStr.size()==0)
			System.out.println("无相同字符串");
		else
		System.out.println("相同的字符串如下所示：" + equalStr);
		
	}
	
	public static void randomContent() {

		for (int i = 48; i < 58; i++) {
			randomStr +=(char)i;
		}
		for (int i = 65; i < 91; i++) {
			randomStr +=(char)i;
		}
		for (int i = 97; i < 123; i++) {
			randomStr +=(char)i;
		}

	}
	
	
	public static String randomFill() {
		int charFirst = (int)(Math.random()*randomStr.length());
		int charSecond= (int)(Math.random()*randomStr.length());
		
		String temp = String.valueOf(randomStr.charAt(charFirst)) + String.valueOf(randomStr.charAt(charSecond));
		return temp;
	}
}
