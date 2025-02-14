class lingkup {
    String warna = "Merah";

    void infoLingkup() {
        String warna = "Biru";
        System.out.println("warna pada metode: " + warna);
        System.out.println("warna milik kelas: " + this.warna);
    }
}

public class lingkupvariabel {

    public static void main(String[] args) {
        lingkup varx = new lingkup();
        varx.infoLingkup();
    }
}
