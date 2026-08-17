

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        String[] str = s.split(" ");

        for(int i= str.length-1; i>=0; i--){
           
                System.out.println(str[i]);
            
        }



    }

}