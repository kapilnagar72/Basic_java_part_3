package Basic_java_part_3;

public class Const3 {

    static int a;

    static
    {
        System.out.println("static bloack");
        a = 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
