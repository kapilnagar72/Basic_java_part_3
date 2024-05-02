package Basic_java_part_3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetorLinkedhashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(10);
        hs.add(30);
        hs.add(100);
        hs.add(32);
        System.out.println(hs);

        LinkedHashSet lh = new LinkedHashSet();
        lh.add(10);
        lh.add(30);
        lh.add(100);
        lh.add(32);
        System.out.println(lh);
    }
}
