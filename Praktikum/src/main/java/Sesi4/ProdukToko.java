package Sesi4;

import java.util.ArrayList;

// Kelas Produk untuk menyimpan data produk
class Produk {
    private int id;
    private String nama;
    private double harga;
    private int stok;

    public Produk(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan informasi produk
    public void tampilkanProduk() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok);
    }
}

// Kelas utama untuk ProdukToko
public class ProdukToko {
    public static void main(String[] args) {
        // Membuat daftar produk
        ArrayList<Produk> daftarProduk = new ArrayList<>();

        // Menambahkan produk secara manual
        daftarProduk.add(new Produk(101, "Buku", 15000, 50));
        daftarProduk.add(new Produk(102, "Pensil", 3000, 100));
        daftarProduk.add(new Produk(103, "Penghapus", 2000, 75));

        // Menampilkan daftar produk
        System.out.println("Daftar Produk Toko:");
        for (Produk produk : daftarProduk) {
            produk.tampilkanProduk();
        }
    }
}