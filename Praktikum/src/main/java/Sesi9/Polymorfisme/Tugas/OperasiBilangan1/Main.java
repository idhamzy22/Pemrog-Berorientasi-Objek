package Sesi9.Polymorfisme.Tugas.OperasiBilangan1;

public class Main {
    public static void main(String[] args) {

        // Nilai A dan B
        double a = 10.5;
        double b = 0.5;

        // Array Operasi
        OperasiBilangan[] operasiArray = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Cetak semua operasi
        PrintOperasi cetak = new PrintOperasi();
        cetak.cetakSemua(operasiArray, a, b);
    }   
}