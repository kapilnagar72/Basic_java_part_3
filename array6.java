package Basic_java_part_3;

/**
 * Innerarray6
 */
class calc {
public int add(int num[])
{
    int result = 0;
    for (int n : num) {
        result = result + n;
    }
    return result;
}
    
}
public class array6 {
    public static void main(String[] args) {
        calc obj = new calc();
        
        int result = obj.add(new int[] { 3, 4, 6, 8, 6, 3, 6, 3, 7 });
        System.out.println(result);

    }
}
