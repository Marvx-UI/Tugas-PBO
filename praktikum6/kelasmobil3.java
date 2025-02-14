class mobil {
    String warna;
    int tahunProduksi;

    // Metode untuk mengisi data
    void isiData(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
}

public class kelasmobil3 {
    public static void main(String[] args) {
        mobil mobilku = new mobil();

        mobilku.isiData("Merah", 2003);

        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
    }
}
