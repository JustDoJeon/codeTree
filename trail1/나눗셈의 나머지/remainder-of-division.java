
import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[10];
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt =0;
        int namuji =0;
        while(true){

            namuji = n%m;
            n = n / m;
            arr[namuji]++;
            
            if(n <=1){
                break;
            }

        }

        for(int i =0; i<10; i++){
            if(arr[i]!= 0 ){
                cnt = cnt + (int)Math.pow(arr[i],2);
            }
        }

        System.out.println(cnt);


    }
}