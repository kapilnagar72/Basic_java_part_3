package Basic_java_part_3;

class Aeroplane {
   public void takeoff()
    {
        System.out.println("take of the plane");
   }

   public void fly()
   {
    System.out.println("plane are fly");
   }
}

class Cargoplane extends Aeroplane {
   public void fly()   //overidding method
   {
       System.out.println(" plane are flying ");
   }

public void carrygood()
   
 {
    System.out.println("carry the all items");
}
}

class Passagerplane extends Aeroplane
{
  public void fly()
  {
    System.out.println("passgerplane flying in low height");
  }
}

public class inher5 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeoff();
        cp.fly();
        
        Passagerplane pp = new Passagerplane();
        pp.takeoff();
        pp.fly();

    }
}
