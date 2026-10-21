
import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int prev = Integer.parseInt(br.readLine());

        int count = 1;
        int max = 1;

        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == prev) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);

            prev = num;
        }

        System.out.println(max);

    }
}
