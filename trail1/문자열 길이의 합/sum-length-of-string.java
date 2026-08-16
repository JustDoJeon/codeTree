

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int len = 0;
        int sum =0 ; 
        for(int i=0; i<n; i++){
            String str = br.readLine();
            len += str.length();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='a'){
                    sum++;
                }
            }
        }

        System.out.println(len +" " + sum);



    }

}