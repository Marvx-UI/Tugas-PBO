class lingkaran {
    private double radius;

    void isiJariJari(double radius) {
        this.radius = radius;
    }

    public double perolehPi() {
        return 3.141592653589793;
    }

    public double perolehKeliling() {
        return 2 * perolehPi() * radius;
    }
}

public class penentumetode {
    public static void main(String[] args) {
        lingkaran bulatan = new lingkaran();
        bulatan.isiJariJari(75);

        System.out.println("Keliling = " + bulatan.perolehKeliling());
        System.out.println("Pi = " + bulatan.perolehPi());
    }
}
