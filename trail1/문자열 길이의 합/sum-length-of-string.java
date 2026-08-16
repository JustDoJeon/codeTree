import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int totalLength = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            // 모든 문자열 길이의 합
            totalLength += str.length();

            // 각 문자열의 첫 번째 문자가 'a'인지 확인
            if (str.charAt(0) == 'a') {
                count++;
            }
        }

        System.out.println(totalLength + " " + count);
    }
}