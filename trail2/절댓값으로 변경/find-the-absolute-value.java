import java.util.Scanner;

public class Main {    
    public static final int MAX_N = 50;
    
    public static int n;
    public static int[] arr = new int[MAX_N];
    
    // 배열의 값들을 그 값의 절대값으로 변경합니다.
    // call by reference로 구현합니다.
    public static void absoluteValue(int[] arr) {
        for(int i = 0; i < n; i++)
            if(arr[i] < 0)
                arr[i] = -arr[i];
        
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        absoluteValue(arr);
        
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
