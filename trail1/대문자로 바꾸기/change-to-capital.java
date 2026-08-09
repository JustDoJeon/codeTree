

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char[][] arr = new char[5][3];

        for(int i =0; i<5; i++ ) {
        StringTokenizer   st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++) {
                arr[i][j] = st.nextToken().charAt(0);
            }
        }


        for(int i =0; i<5; i++ ) {
            for(int j=0; j<3; j++) {
                sb.append(Character.toUpperCase(arr[i][j]) +" ");
            }
            sb.append("\n");
        }

                System.out.println(sb);

    }
}