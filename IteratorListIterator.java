package Basic_java_part_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
    }
}
