package Basic_java_part_3;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add(100);
        ad.add(100);
        ad.add("wd");
        System.out.println(ad);

        ad.addFirst("kalpu");
        ad.addLast("zd");

        System.out.println(ad);

        ad.offer(90);
        ad.offer("op");

        System.out.println(ad);
    }
}
