import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int[] arr = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(str[i]);

            if (num % 2 == 0) {
                arr[idx++] = num;
            }
        }

        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}