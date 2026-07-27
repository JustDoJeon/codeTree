import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        // 입력
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            arr[count] = num;
            count++;
        }

        // 역순 출력
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}