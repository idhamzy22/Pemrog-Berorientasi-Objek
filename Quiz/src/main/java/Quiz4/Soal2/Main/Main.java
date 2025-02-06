package Quiz4.Soal2.Main;

import Quiz4.Soal2.Inheritance.Bayar;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Bayar
        Bayar bayar = new Bayar(101, 15000, 10, "Ahmad");

        // Menampilkan data pembayaran
        System.out.println("=== Data Pembayaran Gojek ===");
        bayar.tampil();

        // Mengatur data tambahan
        bayar.setData();

        // Menampilkan ID
        System.out.println("ID Pembayaran: " + bayar.getId());
    }
}