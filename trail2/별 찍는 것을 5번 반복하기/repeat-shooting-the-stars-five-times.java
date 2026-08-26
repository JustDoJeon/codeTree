
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        printStart();

    }


    public static void printStart(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}