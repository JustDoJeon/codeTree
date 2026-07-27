
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int idx = 0;

        int sum = 0;

        for(int i=0; i<100; i++ ){
            int num = sc.nextInt();
            if(num ==0 ){
                break;
            }
            arr[idx] = num;
            idx++;
        }

        for(int i=idx; i>=idx-3; i--){
            sum += arr[i];
        }

        System.out.println(sum);



    }

}