class matematika {

    public static double kuadrat(double nilai) {
        return nilai * nilai;
    }
}

public class metodekelas2 {
    public static void main(String[] args) {
        double bilangan = matematika.kuadrat(25.0);
        System.out.println(bilangan);
    }
}
