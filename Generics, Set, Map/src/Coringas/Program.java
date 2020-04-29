package Coringas;

import Coringas.Entities.Circle;
import Coringas.Entities.Rectangle;
import Coringas.Entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(3.0, 2.0));
        list.add(new Circle(4.0));

        System.out.println("Total area: " + totalArea(list));
    }
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape shape : list){
            sum += shape.area();
        }
        return sum;
    }
}
