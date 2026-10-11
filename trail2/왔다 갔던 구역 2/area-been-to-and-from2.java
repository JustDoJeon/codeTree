
import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        int position = 0;

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int distance = Integer.parseInt(st.nextToken());
            char direction = st.nextToken().charAt(0);

            if (direction == 'R') {

                // position ~ position + distance 사이의 단위 구간
                for (int j = 0; j < distance; j++) {

                    int line = position + j;

                    map.put(
                            line,
                            map.getOrDefault(line, 0) + 1
                    );
                }

                position += distance;

            } else {

                // 왼쪽으로 갈 때
                for (int j = 1; j <= distance; j++) {

                    int line = position - j;

                    map.put(
                            line,
                            map.getOrDefault(line, 0) + 1
                    );
                }

                position -= distance;
            }
        }

        int answer = 0;

        for (int count : map.values()) {
            if (count >= 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}