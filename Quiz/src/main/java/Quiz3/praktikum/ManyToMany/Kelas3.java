package Quiz3.praktikum.ManyToMany;

import java.util.ArrayList;
import java.util.List;

public class Kelas3 {
    private String namaKelas;
    private String kodeKelas;
    private List<Mahasiswa3> mahasiswaList;

    public Kelas3(String namaKelas, String kodeKelas) {
        this.namaKelas = namaKelas;
        this.kodeKelas = kodeKelas;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public List<Mahasiswa3> getMahasiswaList() {
        return mahasiswaList;
    }

    public void addMahasiswa(Mahasiswa3 mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);
            mahasiswa.addKelas(this); // Menghindari duplikasi
        }
    }

    public void displayInfo() {
        System.out.println("Kelas: " + namaKelas + " (" + kodeKelas + ")");
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa3 mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}