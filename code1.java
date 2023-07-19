import java.io.*;
import java.util.*;
 
public class code1 {//BINARY --> CAESAR CIPHER DECODER
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	String message = readLine();
    	    	
        	String [] letters = message.split(" ");
        	
        	for(int j = 0; j < letters.length; j++) {
        		int decimal = 0;
        		for(int k = 0; k < letters[j].length(); k++) {
        			if(letters[j].charAt(letters[j].length() - 1 - k) == '1') {
        				decimal += Math.pow(2, k);
        			}
        		}
        		
        		if(decimal == 0) {
        			System.out.print(" ");
        		}else {
        			System.out.print((char)(decimal+64));
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