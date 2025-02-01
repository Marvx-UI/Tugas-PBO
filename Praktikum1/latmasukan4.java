public class latmasukan4 {
    public static void main(String[] args) {
        String st;

        System.out.println("Masukkan Sebuah Bilangan Bulat: ");
        st = KeyboardReader.readString();
        int bilbulat = Integer.valueOf(st).intValue();

        System.out.println("Masukkan Sebuah Bilangan Pecahan: ");
        st = KeyboardReader.readString();
        double bilreal = Double.valueOf(st).doubleValue();

        System.out.println("Bilangan Bulat: " + bilbulat);
        System.out.println("Bilangan Pecahan: " + bilreal);
        System.out.println("Total: " + (bilbulat + bilreal));

    }
}
