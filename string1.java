package Basic_java_part_3;

public class string1 {
    public static void main(String[] args) {
        String brand = "string";
        System.out.println(brand);     //immutable

        brand.concat("us");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("string");
        System.out.println(brand1);

        brand1.append("us");       //mutable
        System.out.println(brand1);

        StringBuffer brand2 = new StringBuffer("string");
        System.out.println(brand2);
    }
}
