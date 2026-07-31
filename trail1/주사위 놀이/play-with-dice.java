
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<10; i++ ){
            int cnt =  Integer.parseInt(st.nextToken());
            arr[cnt]++;
        }

        for(int i=0; i<6; i++){
            int idx = i+1;
            int ans = arr[i+1];
            sb.append( idx + " - "+ ans +"\n");
        }
        System.out.println(sb.toString());

    }
}