

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n;
        int[] a = new int[1000];

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int prevMaxIdx = n;

        while (true) {
            int maxIdx = 0;

            for (int i = 1; i < prevMaxIdx; i++) {
                if (a[i] > a[maxIdx])
                    maxIdx = i;
            }

            System.out.print((maxIdx + 1) + " ");

            if (maxIdx == 0) {
                break;
            }

            prevMaxIdx = maxIdx;

        }
    }
}