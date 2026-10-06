import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int target = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if (target == 0) {
            System.out.println(0);
            return;
        }

        while (target>0) {
            int remainder = target % n;
            target = target / n;

            sb.append(remainder);

        }

        System.out.println(sb.reverse());

    }
}
