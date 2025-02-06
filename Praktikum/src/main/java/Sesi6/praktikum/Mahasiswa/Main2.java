package Sesi6.praktikum.Mahasiswa;

public class Main2 {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa2 mahasiswa1 = new Mahasiswa2("Ahmad", "12345678", 21);

        // Menampilkan data Mahasiswa
        mahasiswa1.displayInfo();

        // Mengubah data Mahasiswa
        mahasiswa1.setNama("Budi");
        mahasiswa1.setNim("87654321");
        mahasiswa1.setUsia(22);

        // Menampilkan data setelah diubah
        mahasiswa1.displayInfo();
    }
}