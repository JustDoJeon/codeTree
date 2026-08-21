import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        String AB = A + B;
        String BA = B + A;

        System.out.println(AB.equals(BA));
    }
}