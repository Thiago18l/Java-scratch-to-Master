import Entities.MyComparator;
import Entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 1200.00));
        Comparator<Product> comp = (p1, p2) -> {
          return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        products.sort(comp);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

