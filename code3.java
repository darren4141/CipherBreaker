import java.io.*;
import java.util.*;
 
public class code3 {//TRANSPOSITION CIPHER DECODER
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
    	String message = readLine();
    	int KEY = 4;
    	int row = (int)Math.floor(message.length()/KEY);
    	
    	System.out.println(message.length());
    	System.out.println(row);
    	
    	char [][]transpo = new char[KEY][row+1];
    	
    	for(int i = 0; i < row*KEY; i++) {
    		transpo[(int)Math.floor(i/row)][i%row] = message.charAt(i);
    	}
    	
    	for(int i = 0; i < KEY; i++) {
    		for(int j = 0; j < row+1; j++) {
    			System.out.print(transpo[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    	System.out.println();
    	System.out.println();
    	
    	for(int i = 0; i < row+1; i++) {
    		for(int j = 0; j < KEY; j++) {
    			if(transpo[j][i] == '|') {
    				System.out.print(" ");
    				continue;
    			}
    			System.out.print(transpo[j][i]);
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