import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        char c = br.readLine().charAt(0);

        int num = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            if (str[i].contains(String.valueOf(c))) {
                num++;
                len += str[i].length();
            }
        }

        System.out.print(num + " ");

        if (num > 0) {
            System.out.printf("%.2f", (double) len / num);
        }
    }
}