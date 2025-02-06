package Sesi9.Polymorfisme.Tugas.OperasiBilangan1;

public class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Perkalian: " +a+ "*" +b+ "=" +c);
    }
}