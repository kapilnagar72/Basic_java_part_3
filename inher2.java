package Basic_java_part_3;


class animal {       //parent class
    void sleep()
    {
        System.out.println("animal need sleep");
     }
}
    // child class
class tiger extends animal        // single type inhertance
{

}
public class inher2 {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.sleep();
    }
}
