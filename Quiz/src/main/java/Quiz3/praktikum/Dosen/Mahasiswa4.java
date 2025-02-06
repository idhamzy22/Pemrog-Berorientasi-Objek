package Quiz3.praktikum.Dosen;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa4 {
    private String nama;
    private String nim;
    private Dosen4 dosenWali;
    private List<MataKuliah4> mataKuliahList;

    public Mahasiswa4(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Dosen4 getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen4 dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void addMataKuliah(MataKuliah4 mataKuliah) {
        if (!mataKuliahList.contains(mataKuliah)) {
            mataKuliahList.add(mataKuliah);
            mataKuliah.addMahasiswa(this); // Menjaga relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum Ada"));
        System.out.println("Mata Kuliah yang Diikuti:");
        for (MataKuliah4 mk : mataKuliahList) {
            System.out.println("- " + mk.getNama());
        }
    }
}