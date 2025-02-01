import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class masukan3 {
    public static void main(String[] args) {
        BufferedReader Inputan = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";

        System.out.println("Masukkan Nama anda: ");
        try {
            nama = Inputan.readLine();
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("Hallo " + nama + "Apa kabar\n");
    }

}