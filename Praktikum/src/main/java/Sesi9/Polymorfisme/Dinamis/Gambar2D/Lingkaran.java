package Sesi9.Polymorfisme.Dinamis.Gambar2D;

public class Lingkaran extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar LIngkaran");
    }
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Lingkaran");
    }
}