
import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class Main {

    static class Tile {
        int whiteCount;
        int blackCount;
        char color;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Character> map = new HashMap<>();

        int position = 0;

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            if (direction == 'R') {
                for(int j =0; j<x; j++){
                    map.put(position,'B');

                    if(j<x-1){
                        position++;
                    }
                }
            }else{
                for(int j =0; j<x; j++){
                    map.put(position,'W');

                    if(j<x-1){
                        position--;
                    }
                }
            }
        }
        int white = 0;
        int black = 0;

        for(char color : map.values()){
            if(color == 'W'){
                white++;
            }else if(color == 'B'){
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}