import java.util.Scanner;

class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
};
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Spy sp = new Spy(sCode,mPoint, time);

           System.out.println("secret code : " + sp.secretCode);
        System.out.println("meeting point : " + sp.meetingPoint);
        System.out.println("time : " + sp.time);
    }
}