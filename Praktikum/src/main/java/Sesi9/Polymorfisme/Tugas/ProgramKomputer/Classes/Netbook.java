package Sesi9.Polymorfisme.Tugas.ProgramKomputer.Classes;

import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;

public class Netbook extends Komputer{
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Klik kanan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Klik kiri mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: Tombol Enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: Mencetak data");
    }
}