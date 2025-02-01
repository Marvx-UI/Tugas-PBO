import java.io.*;

public class latmasukan2 {
    public static void main(String[] args) throws IOException {
        char[] i = new char[5];
        String st = "";

        System.out.println("input String: ");
        for (int x = 0; x < 5; x++) {
            i[x] = (char) System.in.read();
            st += i[x];
        }
        System.out.println("Hasil: " + st);
    }
}
