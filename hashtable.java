package Basic_java_part_3;

import java.util.Hashtable;
import java.util.TreeMap;

public class hashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put(01, "kalpu");
        ht.put(02, "virat");
        ht.put(03, "jaiswal");

        System.out.println(ht);

        TreeMap tm = new TreeMap();
 
        tm.put(01, "rinku");
        tm.put(02, "gill");
        tm.put(03, "sky");

        System.out.println(tm);
    }
}
