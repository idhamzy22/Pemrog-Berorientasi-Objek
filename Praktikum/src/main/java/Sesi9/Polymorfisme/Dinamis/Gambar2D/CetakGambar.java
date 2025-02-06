package Sesi9.Polymorfisme.Dinamis.Gambar2D;

public class CetakGambar extends Bentuk{

    private void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama yaitu method gambar() dan hapus()
        // Pada masing-masing class
        for (int i=0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("======================================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = 
        {
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };
        CetakGambar cetak = new CetakGambar();

        // Menampilkan method gambar() dan hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("======================================");

        // Overriding 
        // Menumpuk method gambar() dan hapus() pada class Bentuk (superclass)
        // Dengan method gambar() dan hapus() pada subclass-nya
        // Yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);
    }
}