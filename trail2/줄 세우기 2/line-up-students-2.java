import java.io.*;
import java.util.*;

public class Main {

    static class Student {
        int index;
        int height;
        int weight;

        public Student(int index, int height, int weight) {
            this.index = index;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            students[i] = new Student(i + 1, x, y);
        }

 Arrays.sort(
        students,
        Comparator
                .comparingInt((Student s) -> s.height)
                .thenComparing(
                        Comparator.comparingInt((Student s) -> s.weight).reversed()
                )
);
        for (Student s : students) {
            System.out.println(s.height + " " + s.weight + " " + s.index);
        }
    }
}