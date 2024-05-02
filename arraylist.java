package Basic_java_part_3;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(233);

        System.out.println(al);
         
        ArrayList al1 = new ArrayList();

        al1.add("kalpu");
        al1.add(23);
        al1.add(234);
        al1.add("h");

        System.out.println(al1);

        al1.add("rt");
        System.out.println(al1);

        al1.size();
        System.out.println(al1);

        al1.addAll(al);
        System.out.println(al1);


    }
}
