package Basic_java_part_3;

import java.util.ArrayList;

public class gen1 {
    public static void main(String[] args) {
        // types safety 
        String ar[] = new String[10];
        ar[0] = "sanju";
        ar[1] = "miller";
        ar[2] = "sunil";

        String name1 = ar[0];
        String name2 = ar[1];
        String name3 = ar[2];

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        // no types safety
        //ArrayList al = new ArrayList();
       
        //types safety  used generic 
        ArrayList<String> al = new ArrayList<>();

        al.add("raj");
        al.add("sriom");
        al.add("arun");

        //System.out.println(al);

        String n1 = al.get(0);
        String n2 = al.get(1);
        String n3 = al.get(2);
    
    }
}
