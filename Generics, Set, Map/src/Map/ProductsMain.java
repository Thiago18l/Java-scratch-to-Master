package Map;

import Map.Entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductsMain {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Iphone", 399.0);
        Product p3 = new Product("Notebook", 1200.0);

            stock.put(p1, 1000.0);
            stock.put(p2, 500.0);
            stock.put(p3, 250.0);

            Product ps = new Product("Tv", 900.0);
                System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
