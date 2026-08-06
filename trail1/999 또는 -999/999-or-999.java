
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


       while(st.hasMoreTokens()){

           int num = Integer.parseInt(st.nextToken());

           if(num == -999 || num == 999){
               break;
           }else {
               min = Math.min(num, min);
               max = Math.max(num, max);
           }
       }


        System.out.println(max +" " + min);






    }


}