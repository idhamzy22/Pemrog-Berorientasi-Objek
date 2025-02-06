package Sesi6.praktikum.Dosen;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah4 {
    private String nama;
    private String kode;
    private List<Mahasiswa4> mahasiswaList;

    public MataKuliah4(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public void addMahasiswa(Mahasiswa4 mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);
            mahasiswa.addMataKuliah(this); // Menjaga relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa4 mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}