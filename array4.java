package Basic_java_part_3;

public class array4 {
    public static void main(String[] args) {
        String num[][] = {{"ram","virat","rohit","ankit"},
                           {"vaibhav","vanii","veeru"},
                           {"akaay","sem"},
                           {"vedu"},
                           {"kalpu","kiwi","jems"}};

            for(int i=0; i<=4; i++){
                for(int j=0; j<num[i].length;j++){
                    System.out.print(num[i][j] +" ");
                    }System.out.println();
      }
    }
}
