package Consumer;

import Consumer.Entities.Product;
import Consumer.Util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tesoura", 25.0));
            list.forEach(new PriceUpdate());
            list.forEach(System.out::println);
    }
}
