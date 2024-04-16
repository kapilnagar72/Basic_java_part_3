package Basic_java_part_3;


class animal {       // parent class
    void sleep() {
        System.out.println("animal needs sleeps");
    }
}

class tiger extends animal {          // child class

}
// child class
class dog extends animal {

}
// child class
class cat extends animal
{

}
public class inher3 {
    public static void main(String[] args) {
        cat t = new cat();     //object
        t.sleep();
    }
}
