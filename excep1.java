package Basic_java_part_3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class excep1 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sd = new Scanner(System.in);
        try {
            num = sd.nextInt();
        } catch (InputMismatchException e) 
        {
            System.out.println("enter a number");
        }
        finally {
            sd.close();
        }
        System.out.println(num);
    }
}
