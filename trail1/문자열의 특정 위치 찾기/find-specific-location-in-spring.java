
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        char ch = st.nextToken().charAt(0);
        String answer ="No";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                answer=String.valueOf(i);
                break;
            }
        }

        System.out.println(answer);



    }

}