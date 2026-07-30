
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

    

        for (int i = 0; i < N; i++) {
            int sum =0;
            arr[i] = Integer.parseInt(st.nextToken());
            sum = arr[i] * arr[i];
        System.out.print(sum +" ");
        }

    }
}