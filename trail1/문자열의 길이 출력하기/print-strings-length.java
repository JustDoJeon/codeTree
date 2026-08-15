
Trail 1. Novice Low

Chapter 9

Lesson 1. 공백없는 문자열 입력받아 출력하기

Warmup

Challenge

Test




오늘 목표 달성까지 60XP 남았어요!

30 / 90 XP

기본개념

문제

해설

제출 목록

토론 (6)

Approach 1

문자열의 길이





Code

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




연결됨


12345

