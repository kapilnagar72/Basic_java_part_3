package Basic_java_part_3;


class demo {
    public void a()
    {

    }

    public void b()
    {
        int num = 20;
        int num1 = 0;
        try {
            int result = num / num1;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

    }
}
public class excep2 {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.b();
    }
}
