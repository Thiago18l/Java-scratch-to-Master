package Introduction;

import Introduction.Services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
            System.out.println("How many values?:");
            int number = input.nextInt();

                for (int i = 0; i < number; i++) {
                    Integer value = input.nextInt();
                    ps.addValue(value);
                }
                ps.print();
                Integer x = ps.first();
                System.out.println("First :" + x);

                input.close();
    }
}
