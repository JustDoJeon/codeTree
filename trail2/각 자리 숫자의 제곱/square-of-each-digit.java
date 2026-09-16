import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
int result = sumNumber(n);
System.out.println(result);

    }

    public static int sumNumber(int n){
        if(n<10){
            return n*n;
        }

        return (int)Math.pow(n%10,2)+sumNumber(n/10);
    }
}