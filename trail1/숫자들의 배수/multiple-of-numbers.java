import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        
        int cnt = 0 ;

        int num = Integer.parseInt(br.readLine());


        for(int i=1; i<11; i++){
            int f = num * i ;
            if(f % 5 ==0 ){
                cnt++;
            }
            
            if(cnt == 3 ) {
                break;
            }else{
                sb.append(num * i +" ");    
            }
        }

        System.out.println(sb.toString());


    }
}