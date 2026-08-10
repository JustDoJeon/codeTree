
import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int value = i + j * n + 1;

                System.out.print(value + " ");
            }

            System.out.println();
        }


    }
}