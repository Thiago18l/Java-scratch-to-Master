package Function;

import Function.Entities.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Mouse", 20.00));

        List<String> names = products.stream().map(Product::UpperCaseName).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
