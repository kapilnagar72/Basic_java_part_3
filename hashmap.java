package Basic_java_part_3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "kalpu");
        hm.put("ram", 4);
        hm.put("2", "ram");
        System.out.println(hm);

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(01, 99);
        lhm.put(02, 99);
        lhm.put(03, 99);
        System.out.println(lhm);
    }
}
