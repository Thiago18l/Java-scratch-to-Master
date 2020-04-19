import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.println("The number of products:");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println("Product #"+ i + " data:");
            System.out.print("Common, used or imported (c/u/i)?:");
            char type = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            if (type == 'c'){
                products.add(new Product(name, price));
            }else if (type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date date = sdf.parse(input.next());
                products.add(new UsedProduct(name, price, date));
            }else if (type == 'i'){
                System.out.print("Customs fee: ");
                double Fee = input.nextDouble();
                products.add(new ImportedProduct(name, price, Fee));
            }
        }

        System.out.println();
            System.out.println("PRICE TAGS:");
            for (Product product : products){
                System.out.println(product.priceTag());
            }

    }
}
