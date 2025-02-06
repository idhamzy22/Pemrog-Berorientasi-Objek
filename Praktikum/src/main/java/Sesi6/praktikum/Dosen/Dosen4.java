package Sesi6.praktikum.Dosen;

import java.util.ArrayList;
import java.util.List;

public class Dosen4 {
    private String nama;
    private String nip;
    private List<Mahasiswa4> mahasiswaWaliList;

    public Dosen4(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
        this.mahasiswaWaliList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public void tambahMahasiswa(Mahasiswa4 mahasiswa) {
        if (!mahasiswaWaliList.contains(mahasiswa)) {
            mahasiswaWaliList.add(mahasiswa);
            mahasiswa.setDosenWali(this); // Mengatur relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Mahasiswa Bimbingan:");
        for (Mahasiswa4 mhs : mahasiswaWaliList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}