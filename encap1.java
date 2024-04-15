package Basic_java_part_3;

/**
 * Innerencap1
 */
class Innerencap1 {
         private int age;
         private String name;

public void setData1(int age)
{
    this.age = age;

}
         
public void setData2(String name) {
    
    this.name = name;
}
         public void show() {
                System.out.println(name+" "+age);
             }
}         

public class encap1 {
    public static void main(String[] args) {
        Innerencap1 obj = new Innerencap1();
        Innerencap1 obj1 = new Innerencap1();
        obj.setData1(20);
        obj1.setData1(24);

        obj.setData2("butller");
        obj1.setData2("samson");

        //System.out.println(obj.age);
        //obj.setData();
        obj.show();
        obj1.show();
    }
}
