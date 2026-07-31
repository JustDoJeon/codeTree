import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();



        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num % 2 == 0 ){
                sb.append(num +" ");
            }

        }

        System.out.println(sb.toString());


    }
}