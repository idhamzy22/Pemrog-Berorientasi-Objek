package Sesi4;

// Kelas Mobil
class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor
    public Mobil(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";
        }
    }

    void cetakAtribut() {
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
    }
}

// Kelas utama
public class ClassMobil {
    public static void main(String[] args) {
        // Membuat objek Mobil dengan inisialisasi parameter yang benar
        Mobil mobilku = new Mobil("berjalan", "merah", 0);

        // Mengubah nilai atribut secara langsung
        mobilku.kecepatan = 0;
        mobilku.warna = "merah";

        // Cek kecepatan dan ubah aktifitas jika kecepatan 0
        mobilku.cekKecepatan();

        // Cetak atribut mobil
        mobilku.cetakAtribut();
    }
}