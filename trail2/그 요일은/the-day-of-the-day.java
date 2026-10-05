import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String targetDay = br.readLine();

        String[] days = {
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };

        int[] monthDays = {
                0,
                31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int targetIndex = 0;

        for (int i = 0; i < 7; i++) {
            if (days[i].equals(targetDay)) {
                targetIndex = i;
                break;
            }
        }

        int currentDayIndex = 0; // m1, d1은 월요일
        int count = 0;

        int month = m1;
        int day = d1;

        while (true) {

            if (currentDayIndex == targetIndex) {
                count++;
            }

            if (month == m2 && day == d2) {
                break;
            }

            day++;
            currentDayIndex = (currentDayIndex + 1) % 7;

            if (day > monthDays[month]) {
                month++;
                day = 1;
            }
        }

        System.out.println(count);
    }
}