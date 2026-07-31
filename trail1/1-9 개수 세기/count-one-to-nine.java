
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++ ){
            int cnt =  Integer.parseInt(st.nextToken());
            arr[cnt-1]++;
        }


        for(int a : arr ){
            System.out.println(a);
        }

    }
}