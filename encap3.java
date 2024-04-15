package Basic_java_part_3;

/**
 * Innerencap3
 */
class Innerencap3 {
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
    System.out.println(name+" "+age);
  }
    
}
public class encap3 {
    public static void main(String[] args) {
        Innerencap3 obj = new Innerencap3();
        Innerencap3 obj1 = new Innerencap3();

        obj.setAge(20);
        obj1.setAge(23);

        obj.setName("Rohit");
        obj1.setName("virat");

        int stAge = obj.getAge();
        System.out.println(stAge);

        int stAge1 = obj1.getAge();
        System.out.println(stAge1);
       
        String stName = obj.getName();
        System.out.println(stName);

        String stName1 = obj1.getName();
        System.out.println(stName1);

    }
}
