package Predicate;

import Predicate.Entities.Product;
import Predicate.Utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
            list.add(new Product("Tv", 900.0));
            list.add(new Product("Notebook", 1200.0));
            list.add(new Product("Mouse", 50.0));
            list.add(new Product("Tesoura", 25.0));

            list.removeIf(p -> p.getPrice() >= 100.0);

            for (Product p : list) {
                System.out.println(p);
            }
    }
}
