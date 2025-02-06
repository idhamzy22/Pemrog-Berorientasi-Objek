package Sesi6.praktikum.Jurusan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");

        // Membuat objek Mahasiswa dengan Jurusan
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika);

        // Menampilkan data Mahasiswa beserta Jurusannya
        mahasiswa1.displayInfo();

        // Mengubah data Jurusan Mahasiswa
        Jurusan jurusanSistemInformasi = new Jurusan("Sistem Informasi", "SI456");

        mahasiswa1.setJurusan(jurusanSistemInformasi);

        // Menampilkan data setelah perubahan
        mahasiswa1.displayInfo();
    }
}