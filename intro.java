package Basic_java_part_3;

class student {
    private String name;
    private int age;
    private String city;

    public student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString(){
        return "Name :" + name + "| Age :" + age + "|City :" + city ;
    }
}

public class intro {
    public static void main(String[] args) {
        student st = new student("rohit", 22, "mumbai");
        System.out.println(st);
        student st1 = new student("raju", 40,"chennai");
        System.out.println(st1);
    }
}
