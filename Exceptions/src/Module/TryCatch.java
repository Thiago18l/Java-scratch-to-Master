package Module;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
            method1();
            System.out.println("End of Program");

    }
    public static void method1() {
        System.out.println("METHOD 1 START");
        method2();
        System.out.println("METHOD 1 END");
    }

    public static void method2() {

        System.out.println("method 2 *** start");
        Scanner input = new Scanner(System.in);
        try{
            String[] vetor = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vetor[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }
        input.close();
        System.out.println("method 2 *** end");
    }
}
