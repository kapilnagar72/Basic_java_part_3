package Basic_java_part_3;

public class operator5 {
    public static void main(String[] args)
    {
        int a = 20;
        int b = 20;
        int c = 40;
        // and operator  all condition are ture print true other wise false
     
    //    System.out.println(a == b && a <= b && b < c);  
    //  System.out.println(a==b && b==c && c>=a);

    // or operator  any one condition are print true need only one condition  

    System.out.println(a == b || a <= c || c > a);
    System.out.println(b == c || c == a || a > b);
    
    // ! not not ture =false  ! false = true

    System.out.println(!true); // false
    System.out.println(!false); // true
    }
    
}
