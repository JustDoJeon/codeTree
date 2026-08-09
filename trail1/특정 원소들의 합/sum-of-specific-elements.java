
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double avg1 = 0.0;
        double avg2 = 0.0;
        double avg3 = 0.0;
        double avg4 = 0.0;
        double avg5 = 0.0;
        double avg6 = 0.0;
        double avg7 = 0.0;

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int sum = 0;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                sum+=arr[i][j];
            }
        }

        System.out.println(sum);
    }
}