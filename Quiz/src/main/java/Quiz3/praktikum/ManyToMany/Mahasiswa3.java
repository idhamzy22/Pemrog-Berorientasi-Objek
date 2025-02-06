package Quiz3.praktikum.ManyToMany;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa3 {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan3 jurusan;
    private List<Kelas3> kelasList;

    public Mahasiswa3(String nama, String nim, int usia, Jurusan3 jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
        this.kelasList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Jurusan3 getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan3 jurusan) {
        this.jurusan = jurusan;
    }

    public List<Kelas3> getKelasList() {
        return kelasList;
    }

    public void addKelas(Kelas3 kelas) {
        if (!kelasList.contains(kelas)) {
            kelasList.add(kelas);
            kelas.addMahasiswa(this); // Menghindari duplikasi
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        if (jurusan != null) {
            System.out.println("Jurusan: " + jurusan.getNama());
        }
        System.out.println("Kelas yang diikuti:");
        for (Kelas3 kelas : kelasList) {
            System.out.println("- " + kelas.getNamaKelas());
        }
    }
}