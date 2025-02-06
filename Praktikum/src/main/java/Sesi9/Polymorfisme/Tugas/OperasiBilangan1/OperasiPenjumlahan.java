package Sesi9.Polymorfisme.Tugas.OperasiBilangan1;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Penjumlahan: " +a+ "+" +b+ "=" +c);
    }
}