
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

        String binaryString = Integer.toBinaryString(n);

        System.out.println(binaryString);

    }
}