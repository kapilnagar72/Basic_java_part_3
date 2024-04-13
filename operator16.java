package Basic_java_part_3;

public class operator16 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
