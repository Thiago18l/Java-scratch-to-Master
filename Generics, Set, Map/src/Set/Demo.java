package Set;

import Set.Entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Product> productSet = new TreeSet<>();
        productSet.add(new Product("Tv", 900.0));
        productSet.add(new Product("Notebook", 1200.0));
        productSet.add(new Product("Tablet", 400.0));

        for (Product p : productSet) {
            System.out.println(p);
        }
    }
}
