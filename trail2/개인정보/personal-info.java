

import java.io.*;
import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static class Student {
        String name;
        int height;
        Double weight;

        public Student(String name, int height, Double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Student[] students = new Student[5];
        StringTokenizer st ;
        for(int i = 0; i < students.length; i++) {
            st= new StringTokenizer(br.readLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
        }

        // 이름 정렬 오름차순
        Arrays.sort(students, Comparator.comparing(s->s.name));

        System.out.println("name");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name +" " + students[i].height + " " + students[i].weight);
        }

        Arrays.sort(
                students,
                Comparator.comparingInt((Student s) -> s.height).reversed()
        ); 
        System.out.println();
        
        System.out.println("height");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name +" " + students[i].height + " " + students[i].weight);
        }


    }
}