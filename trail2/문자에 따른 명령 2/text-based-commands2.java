import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int x  = 0 ;
        int y = 0;
        int dir =0; 
        
        

        for (int i = 0; i < input.length(); i++) {
            char command = input.charAt(i);
            if(command=='L'){
                
                dir =( dir +3 ) % 4 ;

            }else if(command=='R'){
                dir = (dir +1 ) %4 ;
            }else {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x +" " + y );




    }
}