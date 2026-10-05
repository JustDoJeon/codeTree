import java.util.Comparator;
import java.util.*;
public class Main {

    static class Person {
        String name;
        int n1;
        int n2;
        int n3;

        Person(String name, int n1, int n2, int n3) {
            this.name = name;
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            people[i] = new Person(name, score1, score2, score3);
        }
        Arrays.sort(people, Comparator.comparingInt(p -> p.n1 + p.n2 + p.n3));
        for(int i=0; i<n; i++){
            System.out.println(people[i].name+" " + people[i].n1 +" " + people[i].n2+ " " + people[i].n3 );
        }
    }
}
