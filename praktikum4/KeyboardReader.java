import java.io.*;

public class KeyboardReader {
    public static String readString() {
        int kar;
        StringBuilder str = new StringBuilder();
        boolean finish = false;

        while (!finish) {
            try {
                kar = System.in.read();
                if (kar < 0 || (char) kar == '\n') {
                    finish = true;
                } else {
                    str.append((char) kar);
                }
            } catch (IOException e) {
                System.err.println("Error Detected");
                finish = true;
            }
        }

        return str.toString().trim(); // Mengembalikan string tanpa spasi berlebih
    }

    public static void main(String[] args) {
        System.out.print("Masukkan sebuah teks: ");
        String input = readString();
        System.out.println("Anda memasukkan: " + input);
    }
}
