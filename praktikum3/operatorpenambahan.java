public class operatorpenambahan {
    public static void main(String[] args) {
        int x, y;

        x = 5;
        y = 8 - x++;
        System.out.println("Contoh 1:");
        System.out.println("x = " + x + ", y = " + y);

        x = 5;
        y = 8 - x;
        System.out.println("Contoh 2:");
        System.out.println("x = " + x + ", y = " + y);

        x = 5;
        y = 8 - x--;
        System.out.println("Contoh 3:");
        System.out.println("x = " + x + ", y = " + y);

        x = 5;
        y = 8 - (++x);
        System.out.println("Contoh 4:");
        System.out.println("x = " + x + ", y = " + y);
    }
}
