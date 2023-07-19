import java.io.*;
import java.util.*;
 
public class code2 {//CAESAR CIPHER DECODER
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	String message = readLine();
    	int KEY = 3;
    	
    	for(int i = 0; i < message.length(); i++) {
    		char target = message.charAt(i);
    		
    		if(target < 97 || target > 122) {
    			System.out.print(target);
    			continue;
    		}else if(target+KEY > 122) {
    			target-=26;
    			char newc = target += KEY;
    			System.out.print(newc);
    		}else {
    			char newc = target += KEY;
    			System.out.print(newc);
    		}
    		
    	}
    	
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}