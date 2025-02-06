package Quiz3.praktikum.ManyToMany;

public class Main3 {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan3 jurusanInformatika = new Jurusan3("Informatika", "IF123");

        // Membuat objek Mahasiswa
        Mahasiswa3 mahasiswa1 = new Mahasiswa3("Ahmad", "12345678", 21, jurusanInformatika);
        Mahasiswa3 mahasiswa2 = new Mahasiswa3("Budi", "87654321", 22, jurusanInformatika);

        // Membuat objek Kelas
        Kelas3 kelasPemrograman = new Kelas3("Pemrograman Java", "PJ101");
        Kelas3 kelasBasisData = new Kelas3("Basis Data", "BD102");

        // Menambahkan Mahasiswa ke dalam Kelas
        kelasPemrograman.addMahasiswa(mahasiswa1);
        kelasPemrograman.addMahasiswa(mahasiswa2);
        kelasBasisData.addMahasiswa(mahasiswa1);

        // Menampilkan data Mahasiswa
        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        // Menampilkan data Kelas
        System.out.println("\nInformasi Kelas:");
        kelasPemrograman.displayInfo();
        kelasBasisData.displayInfo();
    }
}