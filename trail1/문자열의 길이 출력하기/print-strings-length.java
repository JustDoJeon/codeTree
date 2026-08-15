import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str1;
        String str2;
        
        // 문자열을 입력받습니다.
        str1 = sc.next();
        str2 = sc.next();
        
        // 문자열의 길이를 구합니다.
        int len1 = str1.length();
        int len2 = str2.length();
        
        // 두 문자열의 길이의 합을 출력합니다.
        System.out.println(len1 + len2);
    }
}
