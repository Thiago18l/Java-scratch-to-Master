package Consumer;

import Consumer.Entities.Product;
import Consumer.Util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tesoura", 25.0));
            list.forEach(Product::updatePriceUpdater);
            list.forEach(System.out::println);
    }
}
