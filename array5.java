package Basic_java_part_3;

public class array5 {
    public static void main(String[] args) {
        //int[] num = { 2, 2, 3, 4 };
        //for (int n : num) {
        //    System.out.println(n);
        // }

    int [][] num= {{1,3,4,5},
                {0,9,},
                {4,6,2,8,5},
                {5,6,8}};

    for (int a[] : num) {
        for (int b : a) {
                System.out.print(b +" ");
                    }System.out.println();
                }
    }
        
}
