
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr=  {"apple", "banana", "grape", "blueberry", "orange"};
        StringBuilder sb = new StringBuilder();
        char c = br.readLine().charAt(0);
        int ans = 0;
        for(int i=0; i<strArr.length; i++){
            if(c== strArr[i].charAt(2) || c== strArr[i].charAt(3)){
                System.out.println(strArr[i]);
                ans++;
            }
        }
        
  
        System.out.println(ans);
    }
}