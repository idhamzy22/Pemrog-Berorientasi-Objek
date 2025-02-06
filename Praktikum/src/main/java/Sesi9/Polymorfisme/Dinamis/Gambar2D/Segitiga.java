package Sesi9.Polymorfisme.Dinamis.Gambar2D;

public class Segitiga extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar Segitiga");
    }
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Segitiga");
    }
}