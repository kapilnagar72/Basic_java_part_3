package Basic_java_part_3;

interface car {
    void drive();
}

class vaenu implements car {
    public void drive() {
        System.out.println("Driving......");
    }
}
public class demo3 {
    public static void main(String[] args) {
        car obj = new vaenu();
        obj.drive();
    }
}
