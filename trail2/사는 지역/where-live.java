

import java.io.*;
import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    static class User {
        String name;
        String addr;
        String city;
    }
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        User[] users = new User[n];
        StringTokenizer st ;

        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            users[i] = new User();
            users[i].name = st.nextToken();
            users[i].addr = st.nextToken();
            users[i].city = st.nextToken();
        }

        User max = Arrays.stream(users).max(Comparator.comparing(user -> user.name)).get();

        System.out.println("name " + max.name);
        System.out.println("addr " + max.addr);
        System.out.println("city " + max.city);



    }
}