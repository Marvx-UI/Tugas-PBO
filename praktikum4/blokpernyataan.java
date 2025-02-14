
class blokpernyataan {
    public static void main(String[] args) {
        System.out.println("Contoh Blok Pernyataan....");
        int x = 5;

        System.out.println("sebelum blok pernyataan");
        System.out.println("x = " + x);
        {
            int y;

            y = 50;
            x = x + y;
            System.out.println("Di blok pernyataan");
            System.out.println("x =" + y);
            System.out.println("y = " + y);
        }
        System.out.println("setelah blok pernyataan");
        System.out.println("x = " + x);
    }

}