import java.io.*;

public class Main {

    static String str;
    static String target;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        target = br.readLine();

        int answer = -1;

        for (int i = 0; i <= str.length() - target.length(); i++) {

            if (isMatch(i)) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

    // start 위치부터 target 문자열이 시작하는지 확인
    public static boolean isMatch(int start) {

        for (int j = 0; j < target.length(); j++) {

            if (str.charAt(start + j) != target.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}