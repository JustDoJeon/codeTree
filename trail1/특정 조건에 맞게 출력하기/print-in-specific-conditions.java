import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[100];

        int cnt = 0 ;


        for(int i=1; i<100; i++){

            int num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                break;
            }
            
            if(num % 2 ==0 ){
                arr[i] = num /2;
            }else {
                arr[i] = num+3 ;
            }
            
            sb.append(arr[i] +" ");
            

        }
        
        System.out.println(sb.toString());

    }}