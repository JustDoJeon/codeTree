
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;

        for(int i=0; i<10; i++ ){
            int n = Integer.parseInt(st.nextToken());
            max= (int) Math.max(max,n);
        }

        System.out.println(max);





    }


}