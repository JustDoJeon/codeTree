

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str1 = br.readLine();
        str1 = str1.replaceAll(" ", "");
        String str2 = br.readLine();
        str2 = str2.replaceAll(" ", "");
        
        sb.append(str1).append(str2);
        
        

        System.out.println(sb.toString());

    }
}