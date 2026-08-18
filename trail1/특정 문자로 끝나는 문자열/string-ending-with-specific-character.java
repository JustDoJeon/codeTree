import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 10;

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        char c = br.readLine().charAt(0);

        int num = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {

            // 해당 문자로 "시작"하는지 확인
            if (str[i].charAt(str[i].length()-1) == c) {
                System.out.println(str[i]);
            }
        }
    }
}