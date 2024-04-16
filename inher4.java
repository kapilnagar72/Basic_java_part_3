package Basic_java_part_3;

//Multilevel Inheritance
class animal { // parent class
    void sleep() {
        System.out.println("animal needs sleeps");
    }
}

class tiger extends animal { // child class of animal

}

// child class of tiger
class dog extends tiger {

}

// child class of dog
class cat extends dog {

}

public class inher4 {
    public static void main(String[] args) {
        cat t = new cat(); // object
        t.sleep();
    }
}
