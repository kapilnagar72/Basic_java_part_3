package Basic_java_part_3;

public class operator12 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Changed println to print
                }
            }
            System.out.println(); // Added newline after each row
        }
    }
}
