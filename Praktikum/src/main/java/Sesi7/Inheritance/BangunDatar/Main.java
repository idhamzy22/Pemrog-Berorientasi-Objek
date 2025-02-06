package Sesi7.Inheritance.BangunDatar;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari = 7;

        // Membuat objek Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 4;

        // Membuat objek Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 3;

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 8;

        // Menampilkan hasil perhitungan
        System.out.println("Lingkaran:");
        System.out.println(lingkaran.luas());
        System.out.println(lingkaran.keliling());

        System.out.println("\nPersegi:");
        System.out.println(persegi.luas());
        System.out.println(persegi.keliling());

        System.out.println("\nPersegi Panjang:");
        System.out.println(persegiPanjang.luas());
        System.out.println(persegiPanjang.keliling());

        System.out.println("\nSegitiga:");
        System.out.println(segitiga.luas());
        System.out.println(segitiga.keliling());
    }
}