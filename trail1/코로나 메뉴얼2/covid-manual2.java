
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] status = new char[3];
        int[] temp = new int[3];


        StringBuilder sb = new StringBuilder();

        int countA =0;
        int countB =0;
        int countC =0;
        int countD = 0;

     char emergency  = 'E';

        for(int i=0; i<3; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            status[i] = st.nextToken().charAt(0); // Y 또는 N
            temp[i] = Integer.parseInt(st.nextToken());

            if (status[i] == 'Y' && temp[i] >= 37) {
                countA++;
            } else if (status[i] == 'N' && temp[i] >= 37) {
                countB++;
            } else if (status[i] == 'Y' && temp[i] < 37) {
                countC++;
            } else {
                countD++;
            }

        }

        sb.append(countA).append(" ").append(countB).append(" ").append(countC).append(" ").append(countD);

        if (countA>=2) {
            sb.append(" " + emergency);
        }
        System.out.println(sb.toString());
    }
}