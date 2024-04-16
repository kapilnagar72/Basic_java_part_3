package Basic_java_part_3;

class std {
    @SuppressWarnings("unused")
    private String name;
    int age;

    std ()
    {
        System.out.println("std class constructor");
    }
    void sleep() {
        age = 18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}

class std1 extends std {

    void disp() 
    {
        System.out.println("the age is :" + age);
        //System.out.println("the name is :" +name);  //gives error constructor are not extends with class
    }
}

public class inher1 {
    public static void main(String[] args) {
        std1 st = new std1();
        st.sleep();
        st.disp();
    }
}
