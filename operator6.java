package Basic_java_part_3;

public class operator6 {
    
    public static void main(String[] args) {
        int age = 60;
        //
        //    if (age >=18) {
        //        System.out.println("adult");
        //    } else 
        //    {
        //        System.out.println("not adult");
        //    }

        if (age >= 18 && age < 60) {
           System.out.println("young human");
        }
        else if (age >= 60 && age < 90) {
          System.out.println("old human");
        }
         else{
           System.out.println("kid");
         }
    }
}
