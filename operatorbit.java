public class operatorbit {
    public static void main(String[] args) {
        System.out.println("9 & 10 = " + (9 & 10));
        System.out.println("29 & 7 = " + (29 & 7));

        System.out.println("9 | 10 = " + (9 | 10));
        System.out.println("29 | 7 = " + (29 | 7));

        System.out.println("~185 = " + (~185));
        System.out.println("~(-2967) = " + (~(-2967)));

        System.out.println("29 << 1 = " + (29 << 1));
        System.out.println("29 >> 1 = " + (29 >> 1));
        System.out.println("-29 >> 1 = " + (-29 >> 1));

        System.out.println("29 >>> 1 = " + (29 >>> 1));
        System.out.println("-29 >>> 1 = " + (-29 >>> 1));
    }
}
