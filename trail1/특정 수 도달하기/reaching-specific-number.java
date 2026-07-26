import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] arr = new int[10];
        int cnt = 0;
        int ans = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10;  i++){
            int x= sc.nextInt(); 
            arr[i] = x;
        }

        for(int i=0; i< arr.length; i++ ){
            if(arr[i] >=250){
                break;
            }
            ans+= arr[i];
            cnt++;
           
        }
        System.out.print(ans +" ");
        System.out.printf("%.1f", (double) ans / cnt);

    }
}