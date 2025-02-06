package Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Main;

import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Abstracts.OperasiBilanganAbs;
import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.FinalClass.OperasiBilanganAbsCetak;
import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Polymorfisme.OperasiPembagian;
import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Polymorfisme.OperasiPengurangan;
import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Polymorfisme.OperasiPenjumlahan;
import Sesi9.Polymorfisme.Tugas.OperasiBilangan2.Polymorfisme.OperasiPerkalian;

public class Main {
    public static void main(String[] args) {
        double A = 6.5, B = 0.5;

        // Array untuk polimorfisme
        OperasiBilanganAbs[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Final class untuk mencetak
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}