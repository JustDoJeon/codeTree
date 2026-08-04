
import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int cnt = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());


        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++ ){
            if(arr[i] == 2){
                cnt++;
            }
            if(cnt ==3 ){
                System.out.println(i+1);
                break;
            }
        }

    }
}