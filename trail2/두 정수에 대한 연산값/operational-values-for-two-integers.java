
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int min = Math.min(n, m);

        if(n>m){
            n = n + 25;
            m = m*2;
        }else{
            n = n*2;
            m= m+25;
        }

        System.out.println(n + " " + m);


    }


}

