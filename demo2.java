package Basic_java_part_3;

interface computer {
    void compilecode();
}

class laptop implements computer {
    public void compilecode() {
        System.out.println(" gives 3 error ");
    }
}

class desktop implements computer {
    public void compilecode() {
        System.out.println(" gives 5 error ");
    }
}
public class demo2 {
    public static void main(String[] args) {
        System.out.println(" build app");
        desktop obj = new desktop();
        obj.compilecode();
    }
}
