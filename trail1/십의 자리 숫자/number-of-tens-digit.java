
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[11];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<10; i++ ){
            int cnt =  Integer.parseInt(st.nextToken());

            if(cnt == 0 ){
                break;
            }
            arr[cnt/10]++;
        }

        for(int i=1; i<10; i++){
            int idx = i;
            int ans = arr[i];
            sb.append( idx + " - "+ ans +"\n");
        }

        System.out.println(sb.toString());


    }
}