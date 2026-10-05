import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int si = A*60*24 - 11*60*24 ;
        int bun = B*60 - 11*60 ;
        int cho = C - 11;

        System.out.println(si+bun+cho);
    }
}