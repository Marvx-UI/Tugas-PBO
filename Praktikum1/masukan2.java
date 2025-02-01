import java.io.*;

public class masukan2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Masukkan Sebuah Karakter: ");
        char i = (char) System.in.read();
        System.out.println("Anda memasukkan: " + i);
    }
}
