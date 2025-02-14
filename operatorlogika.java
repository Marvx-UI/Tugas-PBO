public class operatorlogika {
    public static void main(String[] args) {
        boolean T = true;
        boolean F = false;

        // Logika AND (&&)
        System.out.println("T and T = " + (T && T));
        System.out.println("T and F = " + (T && F));
        System.out.println("F and T = " + (F && T));
        System.out.println("F and F = " + (F && F));

        // Logika OR (||)
        System.out.println("T or T = " + (T || T));
        System.out.println("T or F = " + (T || F));
        System.out.println("F or T = " + (F || T));
        System.out.println("F or F = " + (F || F));

        // Logika XOR (^)
        System.out.println("T xor T = " + (T ^ T));
        System.out.println("T xor F = " + (T ^ F));
        System.out.println("F xor T = " + (F ^ T));
        System.out.println("F xor F = " + (F ^ F));

        // Logika NOT (!)
        System.out.println("not T = " + (!T));
        System.out.println("not F = " + (!F));
    }
}
