
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

       if(n == 0 ){
           return;
       }

       print(n);
           System.out.println();
        printR(n);
        System.out.println();
       

    }

    public static void print(int n) {
        if(n ==0) {
            return ;
        }

        print(n-1);
        System.out.print(n + " ");

    }

    public static void printR(int n) {
        if(n ==0) {
            return ;
        }
        
        System.out.print(n + " ");
        print(n-1);

    }
}