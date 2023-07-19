import java.io.*;
import java.util.*;
 
public class code4 {//VIGENERE CIPHER DECODER
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	String KEY = "catalyst";
    	int keyInt [] = new int[KEY.length()];
    	
    	for(int i = 0; i < KEY.length(); i++) {
    		keyInt[i] = KEY.charAt(i)-97;
    	}
    	
    	String message = readLine();
    	
    	int j = 0;
    	for(int i = 0; i < message.length(); i++) {
    		boolean space = false;
    		if(message.charAt(i) == ' ') {
    			System.out.print(" ");
    			space = true;
    			continue;
    		}
    		
    		if(message.charAt(i) < 97 || message.charAt(i) > 122) {
    			space = true;
    			System.out.print(message.charAt(i));
    			continue;
    		}
    		
    		char decode = message.charAt(i);
    		decode -= keyInt[j%KEY.length()];
    		
    		if(decode < 97) {
    			decode += 26;
    		}
    		
    		System.out.print(decode);
    		
    		if(!space) {
    			j++;
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