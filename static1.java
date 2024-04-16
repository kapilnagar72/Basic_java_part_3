package Basic_java_part_3;


 class test{
     static int a;
     static int b;

     int m;
     int n;
     static
     {
         System.out.println("control in static block");
         a = 10;
         b = 23;
     }
     {
         System.out.println("control non-static block");
         m = 11;
         n = 14;
     }

     static void disp()
     {
         System.out.println("value of static a :" + a);
         System.out.println("value of static b :" + b);
     }

     void disp1()
     {
         System.out.println("value of non-static m :" + m);
         System.out.println("value of non-static n " + n);
     }
 }
public class static1 {
    public static void main(String[] args) {
        test t = new test();
        test.disp();

        t.disp1();
    }
}
