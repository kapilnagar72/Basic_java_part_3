package Basic_java_part_3;

import java.util.Scanner;

/**
 * Innerstatic2
 */
class formar {
    int pa;
    float td;
    static float ri;
    float si;
    
    static
    {
        ri = 4.5f;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the loan amount ");
        pa = sc.nextInt();

        System.out.println("please enter the time duration");
        td = sc.nextFloat();

        }

    void compute()
    {
        si = (pa * td * ri) / 100;
    }

    void disp()
    {
        System.out.println("si :" + si);
    }
}
public class static2 {
    public static void main(String[] args) {
        formar f = new formar();
        formar f1 = new formar();

        f.input();
        f.compute();
        f.disp();

        f1.input();
        f1.compute();
        f1.disp();
    }
}
