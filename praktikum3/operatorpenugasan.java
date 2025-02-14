public class operatorpenugasan {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        System.out.println("a += b -> " + (a += b));
        System.out.println("a -= b -> " + (a -= b));
        System.out.println("a *= b -> " + (a *= b));
        System.out.println("a /= b -> " + (a /= b));

        a = 20; // Reset nilai a
        System.out.println("a = b -> " + (a = b));

        a = 20; // Reset nilai a
        System.out.println("a &= b -> " + (a &= b));

        a = 20; // Reset nilai a
        System.out.println("a ^= b -> " + (a ^= b));

        a = 20; // Reset nilai a
        System.out.println("a <<= b -> " + (a <<= b));

        a = 20; // Reset nilai a
        System.out.println("a >>= b -> " + (a >>= b));

        a = 20; // Reset nilai a
        System.out.println("a >>>= b -> " + (a >>>= b));
    }
}
