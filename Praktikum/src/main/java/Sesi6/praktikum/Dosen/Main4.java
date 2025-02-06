package Sesi6.praktikum.Dosen;

public class Main4 {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen4 dosen1 = new Dosen4("Dr. Ahmad", "D001");

        // Membuat objek MataKuliah
        MataKuliah4 matkul1 = new MataKuliah4("Pemrograman", "MK101");
        MataKuliah4 matkul2 = new MataKuliah4("Basis Data", "MK102");

        // Membuat objek Mahasiswa
        Mahasiswa4 mahasiswa1 = new Mahasiswa4("Rina", "M001");
        Mahasiswa4 mahasiswa2 = new Mahasiswa4("Budi", "M002");

        // Menetapkan dosen wali dan menambahkan mahasiswa bimbingan
        dosen1.tambahMahasiswa(mahasiswa1);
        dosen1.tambahMahasiswa(mahasiswa2);

        // Menambahkan mata kuliah yang diikuti oleh mahasiswa
        mahasiswa1.addMataKuliah(matkul1);
        mahasiswa1.addMataKuliah(matkul2);
        mahasiswa2.addMataKuliah(matkul1);

        // Menampilkan informasi dosen, mahasiswa, dan mata kuliah
        System.out.println("Informasi Dosen:");
        dosen1.displayInfo();

        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        System.out.println("\nInformasi Mata Kuliah:");
        matkul1.displayInfo();
        matkul2.displayInfo();
    }
}