import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        int num = 0;
        int sum =0;
        double avg =0.0;

        // 입력
        for (int i = 0; i < 10; i++) {
             num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum+=num;
            count++;
        }

        avg = (double ) sum / count ;
        System.out.print(sum +" ");
        System.out.printf("%.1f", avg );
    
    
    }
}