package Basic_java_part_3;

class Innerencap2 {
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class encap2 {
    public static void main(String[] args) {
        Innerencap2 obj = new Innerencap2();
        Innerencap2 obj1 = new Innerencap2();
        obj.setAge(20);
        obj1.setAge(24);

        obj.setName("butller");
        obj1.setName("samson");

        int stdAge = obj.getAge();
        System.out.println(stdAge);

        String stdName = obj1.getName();
        System.out.println(stdName);
    }
}


