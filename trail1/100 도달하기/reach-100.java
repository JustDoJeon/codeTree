import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
      public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[100];
        int b = Integer.parseInt(br.readLine());

        arr[0] = 1;
        arr[1] = b;

        sb.append(arr[0] +" " + arr[1] +" ");


        for (int i = 2; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

            if(arr[i]>100){
  sb.append(arr[i] + " ");
                break;
            }

            sb.append(arr[i] + " ");

        }

        System.out.println(sb.toString());
    }
}