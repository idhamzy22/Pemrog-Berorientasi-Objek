package Sesi9.Polymorfisme.Tugas.OperasiBilangan1;

public class OperasiPembagian extends OperasiBilangan {

    @Override
    protected void tampil() {
        if (b != 0) {
            c = a / b;
            System.out.println("Pembagian: " + a + " / " + b + " = " + c);
        }
        else {
            System.out.println("Pembagian tidak bisa dilakukan, pembagi nol");
        }
    }
}