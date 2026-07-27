import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[11];
        int ans1 =0;
        int ans2 = 0;
        int cnt = 0;
        double avg = 0.0;
        str = br.readLine().split(" ");

        for(int i=1; i<=str.length; i++){
            if(i%2 ==0 ){
                ans1 += Integer.parseInt(str[i]);
            }
            if(i%3 ==0 ){
                ans2 += Integer.parseInt(str[i]);
                cnt++;
            }
        }

        avg  = (double) ans2 / cnt ; 

        System.out.print(ans1 + " " + avg);


    }

}