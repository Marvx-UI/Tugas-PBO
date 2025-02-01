import java.util.Scanner;

public class latmasukan1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("Inputkan Sebuah Byte: ");
        byte a = masukan.nextByte();

        System.out.println("Inputkan Sebuah Short: ");
        short b = masukan.nextShort();

        System.out.println("Inputkan Sebuah Integer: ");
        int c = masukan.nextInt();

        System.out.println("Inputkan Sebuah long: ");
        long d = masukan.nextLong();

        System.out.println("Inputkan Sebuah Float: ");
        float e = masukan.nextFloat();

        System.out.println("Inputkan Sebuah Double: ");
        double f = masukan.nextDouble();

        System.out.println("Inputkan Sebuah String: ");
        String g = masukan.next();

        System.out.println("Inputkan Sebuah Line: ");
        String h = masukan.nextLine();

        System.out.println();

        System.out.println("Masukkan Data 1; " + a);
        System.out.println("Masukkan Data 2; " + b);
        System.out.println("Masukkan Data 3; " + c);
        System.out.println("Masukkan Data 4; " + d);
        System.out.println("Masukkan Data 5; " + e);
        System.out.println("Masukkan Data 6; " + f);
        System.out.println("Masukkan Data 7; " + g);
        System.out.println("Masukkan Data 8; " + h);
    }

}
