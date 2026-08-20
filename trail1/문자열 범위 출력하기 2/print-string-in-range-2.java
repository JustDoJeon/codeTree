import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = s.length() - 1; i >= 0 && n > 0; i--) {
            System.out.print(s.charAt(i));
            n--;
        }
    }
}