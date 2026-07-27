
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr =  br.readLine().split(" ");
        int idx = 0;
        
        for(int i=0; i<strArr.length; i++){
         int n = Integer.parseInt(strArr[i]);
         if(n % 3 == 0 ){
             break;
         }
         idx++;
        }

        System.out.println(Integer.parseInt(strArr[idx-1]));


    }

}