import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            // 이전 문자와 같으면 개수 증가
            if (str.charAt(i) == current) {
                count++;
            }
            // 다른 문자가 나오면 지금까지 센 것 저장
            else {
                sb.append(current);
                sb.append(count);

                current = str.charAt(i);
                count = 1;
            }
        }

        // 마지막 묶음은 for문 안에서 처리되지 않으므로 따로 추가
        sb.append(current);
        sb.append(count);

        System.out.println(sb.length());
        System.out.println(sb);
    }
}