import java.io.*;

public class keyboarreader {
    public static void main(String[] args) {
        int kar;
        String str = "";
        boolean finish = false;
        while (!finish) {
            try {
                kar = System.in.read();
                if (kar < 0 || (char) kar == '\n')
                    finish = true;
            } catch (java.io.IOException e) {
                System.err.println("Error Detected");
                finish = true;
            }

        }

    }

}
