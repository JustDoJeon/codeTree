import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in );

        StringBuilder sb = new StringBuilder();

        char[] arr = new char[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.next().charAt(0);
            sb.append(arr[i]);
        } 
        
        System.out.print(sb.reverse().toString());

    


    }
}