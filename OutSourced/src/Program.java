import Entites.Employee;
import Entites.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
                System.out.println("Employee #" + i + " Data:");
                System.out.print("Outsourced (Y/N)?");
                char ch = input.next().charAt(0);
                System.out.print("Name:");
                input.nextLine(); // consumir a quebra de linha;
                String name = input.nextLine();
                System.out.print("Hours: ");
                int hours = input.nextInt();
                System.out.print("Value per Hour:");
                double valuePerHour = input.nextDouble();
                if (ch == 'y'){
                    System.out.print("Additional Charge:");
                    double additionalCharge = input.nextDouble();
                    list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
                }else {
                    Employee employee = new Employee(name, hours, valuePerHour);
                    list.add(employee);
                }

        }
        System.out.println();
            System.out.print("PAYMENTS:");
                for (Employee employee : list){
                    System.out.println(employee.getName() + " - $ " + String.format("%.2f",employee.payment()));
                }

        input.close();
    }
}
