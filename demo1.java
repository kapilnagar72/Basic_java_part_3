package Basic_java_part_3;

interface a {
    void show();
}

interface x {
    void abc();
}

class b implements a , x{
    public void show() {
        System.out.println("in the show");
    }

    public void abc() {
        System.out.println("in the abc");
    }
}

public class demo1 {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
        obj.abc();
    }
}
