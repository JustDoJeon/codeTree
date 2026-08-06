import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arrA = new int[A];
        int[] arrB = new int[B];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        boolean found = false;

        for (int i = 0; i <= A - B; i++) {
            boolean same = true;

            for (int j = 0; j < B; j++) {
                if (arrA[i + j] != arrB[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}