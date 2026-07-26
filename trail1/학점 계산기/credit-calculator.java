import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double sum =0; 
        double score =0.0;
        double avg =0.0;
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            score  = sc.nextDouble();
            sum += score;
        }

         avg = (double) sum / n;

        if(avg>=4.0){
            System.out.printf("%.1f\n",avg);
            System.out.print("Perfect");
        }else if (avg>=3.0){
            System.out.printf("%.1f\n",avg);
            System.out.print("Good");
        }else{
            System.out.printf("%.1f\n",avg);
            System.out.print("Poor");
        }
        
    }
}