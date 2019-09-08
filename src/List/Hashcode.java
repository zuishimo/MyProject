package List;
 
public class Hashcode {
     
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int length = (int) (Math.random()*8+2);
            String str = randomString(length);
            int hashcode = hashcode(str);
            System.out.printf("%-11s���Զ���hashcode��:%d%n",str,hashcode);         
        }
         
    }
 
    private static int hashcode(String str) {
        // TODO Auto-generated method stub
        if(0==str.length())
            return 0;
         
        int hashcode = 0;
        char[]cs= str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode +=cs[i];
        }
        hashcode*=23;
        //ȡ����ֵ
        hashcode = hashcode<0?0-hashcode:hashcode;
        //����0-1999֮��
        hashcode %=2000;
         
        return hashcode;
    }
     
    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
     
}