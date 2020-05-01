package Challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
            System.out.println("How many students for course A?");
                int number = input.nextInt();
                for (int i = 0; i < number; i++) {
                    int id = input.nextInt();
                    a.add(id);
                }
                System.out.println("How many students for course B?");
                    number = input.nextInt();
                    for (int i= 0; i < number; i++) {
                        int id = input.nextInt();
                        b.add(id);
                    }
                    System.out.println("How many students for course C?");
                        number = input.nextInt();
                        for (int i = 0; i < number; i++) {
                            int id = input.nextInt();
                            c.add(id);
                        }
                        Set<Integer> total = new HashSet<>(a);
                        total.addAll(b);
                        total.addAll(c);
                            System.out.println("Total: " + total.size());
    }
}
