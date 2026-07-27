
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        int idx = 0;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            String[] str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                int score = Integer.parseInt(str[j]);
                if (score % 2 == 0) {
                    arr[idx] = score;
                    idx++;
                }
            }

        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }

    }
}