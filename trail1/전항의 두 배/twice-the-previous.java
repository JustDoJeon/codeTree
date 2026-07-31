
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cur = 0;
        int[] arr= new int[100];

        arr[0] = a;
        arr[1] = b;

        sb.append(arr[0] +" " + arr[1] +" ");

        //2 3 7 13
        for (int i = 2; i < 10; i++) {
            cur = 2*a + b;

            a = b ;
            b=  cur;

            if(arr[i]>100){
                break;
            }

            sb.append(cur + " ");

        }

        System.out.println(sb.toString());
    }
}
