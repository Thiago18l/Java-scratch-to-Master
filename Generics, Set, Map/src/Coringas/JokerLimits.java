package Coringas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JokerLimits {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.27);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        PrintList(myObjs);
        copy(myDoubles, myObjs);
        PrintList(myObjs);
    }
    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }
    public static void PrintList(List<?> list){
        for (Object obj : list){
            System.out.println(obj + "");
        }
        System.out.println();
    }
}
