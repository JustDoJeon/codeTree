import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        int num = 0;
        int sum =0;
        int avg =0;

        // 입력
        for (int i = 0; i < 10; i++) {
             num = sc.nextInt();

            if (num == 0) {
                break;
            }
            
            else if ( num % 2  == 0 && num != 0 ){
            sum+=num;
            count++;
            }
 
        }

        avg = sum / count ;
        System.out.print(count+ " ");
        System.out.print( avg );
        
    }
}