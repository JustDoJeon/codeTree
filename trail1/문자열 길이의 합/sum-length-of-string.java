import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int len = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            // 모든 문자열 길이의 합
            len += str.length();

            // 첫 번째 문자열에서만 a 개수 세기
            if (i == 0) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == 'a') {
                        count++;
                    }
                }
            }
        }

        System.out.println(len + " " + count);
    }
}