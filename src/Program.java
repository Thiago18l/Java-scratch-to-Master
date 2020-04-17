import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Department's name:");
        String departmentName = input.nextLine();

        System.out.print("Enter work data:\n");
        System.out.print("Name:");
        String wName = input.nextLine();

        System.out.print("Level:");
        String wLevel = input.next();


        System.out.print("Base Salary:");
        double wSalary = input.nextDouble();

        Worker worker = new Worker(wName, WorkerLevel.valueOf(wLevel), wSalary, new Departament(departmentName));

        System.out.print("How many contracts to this worker?");
        int contractsNumber = Integer.parseInt(input.next());

        for (int i = 1; i <= contractsNumber; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per Hour:");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (Hours):");
            int hours = input.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.AddContract(contract); // vincula o contrato feito com o trabalhador.
        }
        System.out.println();
            System.out.print("Enter month and year to calculate income (MM/YYYY):");
            String monthAndYear = input.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int Year = Integer.parseInt(monthAndYear.substring(3));
            System.out.println("Name:"+ worker.getName());
            System.out.println("Department:" + worker.getDepartament().getName());
            System.out.println("Income for"+ monthAndYear + ": " + worker.income(Year, month));
        input.close();
    }
}
