
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            arr[num]++;
        }

        System.out.println(min + " " + arr[min]);






    }


}