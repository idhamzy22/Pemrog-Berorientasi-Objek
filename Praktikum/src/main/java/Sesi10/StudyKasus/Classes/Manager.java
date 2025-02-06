package Sesi10.StudyKasus.Classes;

import Sesi10.StudyKasus.Abstracts.Karyawan;
import Sesi10.StudyKasus.Interfaces.Tunjangan;

public class Manager extends Karyawan implements Tunjangan {
    private double tunjanganJabatan;

    public Manager(String nama, double gajiPokok, double tunjanganJabatan) {
        super(nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public double hitungTunjangan() {
        return tunjanganJabatan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + hitungTunjangan();
    }
}