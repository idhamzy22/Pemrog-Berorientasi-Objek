package Sesi10.StudyKasus.Abstracts;

public abstract class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public abstract double hitungGaji();

    public String getNama() {
        return nama;
    }
}