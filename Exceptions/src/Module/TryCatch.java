package Module;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
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

            System.out.println("End of Program");

    }
}
