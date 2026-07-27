
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr =  br.readLine().split(" ");
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<strArr.length; i++){
            if(i % 2 != 0){
                sum1 += Integer.parseInt(strArr[i]);
            }else {
                sum2+=Integer.parseInt(strArr[i]);
            }
        }


        System.out.println(Math.max(sum1,sum2)- Math.min(sum1,sum2));
        

    }

}