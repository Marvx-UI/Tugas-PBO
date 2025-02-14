import java.util.Scanner;

public class kondisiifelse2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Inputkan Nilai : ");
        int angka = masukan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap\n");
        } else {
            System.out.println("Bilangan Ganjil\n");
        }
    }
}
