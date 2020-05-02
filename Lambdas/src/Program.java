import Entities.MyComparator;
import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 1200.00));

        products.sort(new MyComparator());
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

