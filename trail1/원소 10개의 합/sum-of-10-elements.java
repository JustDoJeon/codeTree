import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int ans = 0 ;
        Scanner sc  = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            int x = sc.nextInt();
            ans += x;
        }

        System.out.print(ans);
    


    }
}