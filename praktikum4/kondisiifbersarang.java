public class kondisiifbersarang {
    public static void main(String[] args) {
        System.out.println("Inputkan Nilai Ujian: ");
        String st = KeyboardReader.readString();
        int nilaiUjian = Integer.valueOf(st).intValue();

        char skor;
        if (nilaiUjian >= 90) {
            skor = 'A';
        } else if (nilaiUjian >= 80) {
            skor = 'B';
        } else if (nilaiUjian >= 60) {
            skor = 'C';
        } else if (nilaiUjian >= 50) {
            skor = 'D';
        } else {
            skor = 'E';
        }

        System.out.println("Skor: " + skor);
    }
}
