package Basic_java_part_3;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(122);
        ts.add(12);
        ts.add(11);
        ts.add(112);
        ts.add(34);

        System.out.println(ts);

        ts.add(12);
        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

        System.out.println(ts.first());
        System.out.println(ts.hashCode());  // total value of number
    }
}
