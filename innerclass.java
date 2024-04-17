package Basic_java_part_3;

class A {
    public void show() {
        System.out.println("that show");
    }

    static class B {
        public void display() {
            System.out.println("that display");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        A obj = new A(); // This line should instantiate class A without any issue.
        A.B obj1 = new A.B();
        obj.show();
        obj1.display();
    }
}
