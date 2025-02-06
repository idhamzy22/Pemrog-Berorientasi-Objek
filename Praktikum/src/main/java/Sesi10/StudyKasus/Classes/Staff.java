package Sesi10.StudyKasus.Classes;

import Sesi10.StudyKasus.Abstracts.Karyawan;
import Sesi10.StudyKasus.Interfaces.Tunjangan;

public class Staff extends Karyawan implements Tunjangan {
    private double tunjanganTetap;

    public Staff(String nama, double gajiPokok, double tunjanganTetap) {
        super(nama, gajiPokok);
        this.tunjanganTetap = tunjanganTetap;
    }

    @Override
    public double hitungTunjangan() {
        return tunjanganTetap;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + hitungTunjangan();
    }
}
