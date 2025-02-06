package Sesi9.Polymorfisme.Tugas.OperasiBilangan1;

public class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Pengurangan: " +a+ "-" +b+ "=" +c);
    }
}