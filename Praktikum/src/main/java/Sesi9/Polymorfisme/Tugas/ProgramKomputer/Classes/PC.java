package Sesi9.Polymorfisme.Tugas.ProgramKomputer.Classes;

import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;

public class PC extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("PC: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Tombol Enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Mencetak data");
    }
}