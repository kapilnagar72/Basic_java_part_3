package Basic_java_part_3;

import java.util.ArrayList;
import java.util.Collections;

public class collectionclass {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(23);
        al.add(54);
        al.add(98);
        al.add(45);
        al.add(125);
        System.out.println(al);

        //Collections.sort(al);
        //System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);

        
    }
}
