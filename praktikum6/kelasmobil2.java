class mobil {
    String warna;
    int tahunProduksi;

    // Metode untuk mengisi data
    void isiData(String warnaMobil, int tahunProduksiMobil) {
        warna = warnaMobil;
        tahunProduksi = tahunProduksiMobil;
    }

    // Metode untuk mengambil warna mobil
    String ambilWarna() {
        return warna;
    }

    // Metode untuk mengambil tahun produksi mobil
    int ambilTahunProduksi() {
        return tahunProduksi;
    }
}

public class kelasmobil2 {
    public static void main(String[] args) {
        mobil mobilku = new mobil();

        mobilku.isiData("Merah", 2003);

        System.out.println("Warna: " + mobilku.ambilWarna());
        System.out.println("Tahun: " + mobilku.ambilTahunProduksi());
    }
}
