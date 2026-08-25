import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if (str.contains("ee")) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (str.contains("ab")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}