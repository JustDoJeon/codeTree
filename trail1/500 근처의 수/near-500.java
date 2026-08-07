
import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr= new int[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<10; i++){
            if(arr[i]>max && arr[i]<500) max = arr[i];
            if(arr[i]<min && arr[i]>500) min = arr[i];
        }

        System.out.println(max +" " +min);

    }

}