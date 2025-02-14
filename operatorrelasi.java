public class operatorrelasi {
    public static void main(String[] args) {
        int i = 37;
        int j = 421;
        int x = 42;

        System.out.println("Nilai Variable");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);

        // Lebih Besar Dari
        System.out.println("i > j = " + (i > j));
        System.out.println("j > x = " + (j > x));
        System.out.println("x > j = " + (x > j));

        // Lebih Besar Sama Dengan
        System.out.println("i >= j = " + (i >= j));
        System.out.println("j >= i = " + (j >= i));
        System.out.println("x >= j = " + (x >= j));

        // Lebih Kecil Dari
        System.out.println("i < j = " + (i < j));
        System.out.println("j < x = " + (j < x));
        System.out.println("x < j = " + (x < j));

        // Lebih Kecil Sama Dengan
        System.out.println("i <= j = " + (i <= j));
        System.out.println("j <= x = " + (j <= x));
        System.out.println("x <= j = " + (x <= j));

        // Sama Dengan
        System.out.println("i == j = " + (i == j));
        System.out.println("x == j = " + (x == j));

        // Tidak Sama Dengan
        System.out.println("i != j = " + (i != j));
        System.out.println("x != j = " + (x != j));
    }
}
