


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String str1 = br.readLine();
String str2 = br.readLine();
String str3 = br.readLine();

int min = Math.min(str1.length(), str2.length());
min = Math.min(min, str3.length());

int max = Math.max(str1.length(), str2.length());
max = Math.max(max, str3.length());

System.out.println(max - min);

    }
}