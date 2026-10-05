

import java.io.*;
import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    static class Weather {
        String time;
        String day;
        String ww;
    }
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Weather[] w = new Weather[n];
        StringTokenizer st ;

        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = new Weather();
            w[i].time = st.nextToken();
            w[i].day = st.nextToken();
            w[i].ww = st.nextToken();
        }

        Weather max = Arrays.stream(w).filter(w1->w1.ww.equals("Rain")).min(Comparator.comparing(user -> user.time)).get();

        System.out.println(max.time +" " + max.day + " " + max.ww);



    }
}