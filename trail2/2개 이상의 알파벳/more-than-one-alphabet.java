
import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() != c ){
                System.out.println("Yes");
                return;
            }else{
                st.push(c);
            }
            
        }

        System.out.println("No");
        


    }


}

