import java.util.Scanner;

public class masukan1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Sebuah angka: ");
        int i = masukan.nextInt();

        System.out.println("angka yang anda inputkan adalah: " + i);
    }
}
