
import java.io.*;
import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    static class User {
        char codeName;
        int score;
    }
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        User[] users = new User[5];
        StringTokenizer st ;

        for(int i =0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            users[i] = new User();
            users[i].codeName = st.nextToken().charAt(0);
            users[i].score = Integer.parseInt(st.nextToken());
        }

        User min = Arrays.stream(users).min(Comparator.comparingInt(user -> user.score)).get();

        System.out.println(min.codeName +" " +min.score);


    }
}