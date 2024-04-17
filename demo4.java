package Basic_java_part_3;

interface A {
    void drive();
}

public class demo4 {
    public static void main(String[] args) {
        // Creating an anonymous class that implements interface A
        A obj = new A() {
            public void drive() {
                System.out.println("Driving.....");
            }
        };
        obj.drive();
    }
}
