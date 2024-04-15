package Basic_java_part_3;

/**
 * InnerConst1
 *
 */
class InnerConst1 {
    private int a;
    private int b;
    
    public InnerConst1()
    {
        System.out.println("zero paramerized by programar");
    }
    public InnerConst1(int a, int b) 
    {
        this.a = a;
        this.b = b;
    }
    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Const1 {
    public static void main(String[] args) {
        InnerConst1 d = new InnerConst1();
        d.disp();
        InnerConst1 d2 = new InnerConst1(20, 12);
        d2.disp();

    }
}
