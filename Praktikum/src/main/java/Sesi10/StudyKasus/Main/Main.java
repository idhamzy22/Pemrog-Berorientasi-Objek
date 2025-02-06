package Sesi10.StudyKasus.Main;

import Sesi10.StudyKasus.Abstracts.Karyawan;
import Sesi10.StudyKasus.Classes.Freelancer;
import Sesi10.StudyKasus.Classes.Manager;
import Sesi10.StudyKasus.Classes.Staff;
import Sesi10.StudyKasus.Classes.StatistikKaryawan;
import Sesi10.StudyKasus.FinalClass.GajiKaryawanCetak;

public class Main {
    public static void main(String[] args) {
        Karyawan[] karyawanList = new Karyawan[3];

        karyawanList[0] = new Manager("Budi", 8000000, 2000000);
        karyawanList[1] = new Staff("Siti", 4000000, 500000);
        karyawanList[2] = new Freelancer("Joko", 50000, 160); // 160 jam kerja

        // Cetak rincian gaji setiap karyawan
        GajiKaryawanCetak.cetakGaji(karyawanList);

        // Hitung total gaji menggunakan static method
        double totalGaji = GajiKaryawanCetak.hitungTotalGaji(karyawanList);
        System.out.println("Total Gaji Semua Karyawan: " + totalGaji);

        // Hitung rata-rata gaji menggunakan static method dari StatistikKaryawan
        double rataRataGaji = StatistikKaryawan.hitungRataRataGaji(karyawanList);
        System.out.println("Rata-rata Gaji Karyawan: " + rataRataGaji);
    }
}