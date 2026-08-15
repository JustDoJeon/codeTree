
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[4];
        for(int i=0; i<4 ;i++ ){
            input[i] = br.readLine();
        }
        
        
        for(int i=3; i>=0; i--){
            System.out.println(input[i]);
        }
    }
}