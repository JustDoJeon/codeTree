

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        
        String bb = "Hello";

        String concat = s.concat(bb);
        System.out.println(concat);


    }

}