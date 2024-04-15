package Basic_java_part_3;

/**
 * InnerConst2
 */
class Consttest {
    private int age;
    private String name;

    public Consttest() {
        System.out.println("defult value");
        name = "rohit";
        age = 19;
    }

    public Consttest(String name) {
        this.name = name;
        age = 15;

    }

    public Consttest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Const2 {
    public static void main(String[] args) {
        Consttest d = new Consttest();
        d.disp();

        Consttest d1 = new Consttest("rahul");
        d1.disp();

        Consttest d2 = new Consttest("sem", 23);
        d2.disp();
    }
}
