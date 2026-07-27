
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr =  br.readLine().split(" ");

        for(int i=0; i<strArr.length; i++){
            if(i == 1 || i== 4 || i == 7){
                sb.append(strArr[i]+ " ");
            }
        }

        System.out.println(sb.toString());

    }

}