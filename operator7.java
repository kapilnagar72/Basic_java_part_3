package Basic_java_part_3;

public class operator7 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int res = (a <= b) ? a : b;
        System.out.println(res);

        String result = (a <= b)?"a is less":"b is less";
        System.out.println(result);
    }
}
