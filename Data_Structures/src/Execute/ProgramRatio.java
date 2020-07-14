package Execute;

import Object_oriented_Therminology.Ratio;

public class ProgramRatio {
    public static void main(String[] args) {
        Ratio ratio = new Ratio(1,1);
        ratio = new Ratio(1, 2);
        ratio.add(new Ratio(1, 3));
        ratio = ratio.add(new Ratio(2, 8));
        System.out.println(ratio.getValue());
        System.out.println(ratio.toString());
        System.out.println(ratio); // calls toString too...
    }
}
