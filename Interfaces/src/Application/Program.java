package Application;

import Entities.CarRental;
import Entities.Vehicle;
import Services.BrazilTaxService;
import Services.RentalServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter rental data:");
        try{
            System.out.print("Car model:");
            String model = input.nextLine();
            System.out.print("Pick up (DD/MM/YYYY HH:ss):");
            Date pickUp = sdf.parse(input.nextLine());
            System.out.print("Return (DD/MM/YYYY HH:ss):");
            Date finish = sdf.parse(input.nextLine());

            CarRental cr = new CarRental(pickUp, finish, new Vehicle(model));

            System.out.print("Enter price per hour:");
            double pricePerHour = input.nextDouble();
            System.out.print("Enter price per day:");
            double pricePerDay = input.nextDouble();

            RentalServices rentalServices = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxService());
            rentalServices.processInvoice(cr);

                System.out.print("INVOICE:");
                System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
                System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
                System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
