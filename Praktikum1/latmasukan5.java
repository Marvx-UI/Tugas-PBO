import javax.swing.*;

public class latmasukan5 {
    public static void main(String[] args) {
        String st;

        st = JOptionPane.showInputDialog("Berapa Tinggi Anda: ");
        int h = Integer.parseInt(st);

        st = JOptionPane.showInputDialog("Masukkan Berat Badan Anda: ");
        double w = Double.parseDouble(st);

        System.out.println("Tinggi anda adalah: " + h);
        System.out.println("Berat anda adalah: " + w);

        System.exit(0);
    }
}
