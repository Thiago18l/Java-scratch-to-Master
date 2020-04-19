
import java.util.*;

import Entities.Circle;
import Entities.enums.Color;
import Entities.Rectangle;
import Entities.Shape;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes:");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle (r/c)?:");
            char type = input.next().charAt(0);
            input.nextLine();
            System.out.print("COLOR (BLACK/BLUE/RED)?");
            Color color = Color.valueOf(input.next());
            if (type == 'r'){
                try{
                    System.out.print("Width:");
                    double width = input.nextDouble();
                    System.out.print("Height:");
                    double height = input.nextDouble();
                    shapes.add(new Rectangle(color, width, height));
                }catch (InputMismatchException e){
                    System.out.println(e.getMessage());
                }

            } else if (type == 'c'){
                System.out.print("Radius:");
                    double radius = input.nextDouble();
                    shapes.add(new Circle(color, radius));
            }
        }
        System.out.println();
            System.out.println("SHAPES:");
            for (Shape shape : shapes){
                System.out.println(String.format("%.2f", shape.area()));
            }

    }
}
