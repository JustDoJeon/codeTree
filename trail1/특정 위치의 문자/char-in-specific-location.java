
import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char[] arr = new char[]{'L','E','B','R','O','S'};
        
        char c = br.readLine().charAt(0);
        int idx= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==c){
                idx = i;
            }
        }

        if(idx ==-1){
            System.out.println("NONE");
        }else{

        System.out.println(idx);
        }

    }
}