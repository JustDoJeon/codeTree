
import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int index;
        int x;
        int y;
        int distance;

        Point(int index, int x, int y) {
            this.index = index;
            this.x = x;
            this.y = y;
            this.distance = Math.abs(x) + Math.abs(y);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(i + 1, x, y);
        }

        Arrays.sort(
                points,
                Comparator
                        .comparingInt((Point p) -> p.distance)
                        .thenComparingInt(p -> p.index)
        );

        for (Point p : points) {
            System.out.println(p.index);
        }
    }
}