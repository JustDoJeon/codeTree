import java.io.*;
import java.util.*;

public class Main {

    static class Person {
        String name;
        int height;
        int weight;

        Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            people[i] = new Person(name, height, weight);
        }

        // Arrays.sort(people, Comparator.comparingInt(person -> person.height));
        Arrays.sort(people,Comparator.comparingInt(person->person.height));

        for (Person person : people) {
            System.out.println(
                    person.name + " " +
                    person.height + " " +
                    person.weight
            );
        }
    }
}