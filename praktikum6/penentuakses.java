class siswa {
    public String nama;

    void isiData(String nama) {
        this.nama = nama;
    }

    String ambilNama() {
        return this.nama;
    }
}

public class penentuakses {
    public static void main(String[] args) {
        siswa siswal = new siswa();
        siswal.isiData("Asti Damayanti");
        System.out.println("Nama: " + siswal.ambilNama());
        System.out.println("Nama: " + siswal.nama);
    }
}
