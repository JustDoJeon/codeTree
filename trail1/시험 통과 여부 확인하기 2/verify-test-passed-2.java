import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;



        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
    String[] arr = br.readLine().split(" ");

    int score = 0;
    for (int j = 0; j < 4; j++) {
        score += Integer.parseInt(arr[j]);
    }

    if (score / 4 >= 60) {
        System.out.println("pass");
        ans++;
    } else {
        System.out.println("fail");
    }
}


        System.out.println(ans);
    }
}