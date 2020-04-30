package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Iphone");
            set.removeIf(x -> x.length() >= 3);
            for (String p : set){
                System.out.println(p);
            }
            Set<String> TreeSet = new TreeSet<>();
            TreeSet.add("Coca");
            TreeSet.add("Mouse");
            TreeSet.add("Teclado");
                TreeSet.removeIf(x -> x.charAt(0) == 'M');
                System.out.println();
                    System.out.println("TreeSet: ");
                for (String p : TreeSet) {
                    System.out.println(p);
                }
                System.out.println();
                Set<String> linkedSet = new LinkedHashSet<>();
                linkedSet.add("TV");
                linkedSet.add("Notebook");
                linkedSet.add("Iphone");

                    for (String p : linkedSet) {
                        System.out.println(p);
                    }
    }
}
