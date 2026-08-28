
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine();
        StringBuilder sb =new StringBuilder(input);
        String string = sb.reverse().toString();

        if(input.equals(string)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }


}

