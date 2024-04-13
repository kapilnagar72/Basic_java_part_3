package Basic_java_part_3;

public class operator14 {
    public static void main(String[] args) {

        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
