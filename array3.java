package Basic_java_part_3;

public class array3 {
    public static void main(String[] args) {
        //int num[][] = new int[4][4];
        int num[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(num[i][j] +" ");
            }System.out.println();
         }
    }
}
