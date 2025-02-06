package Sesi7.Inheritance.BangunDatar;

public class Persegi extends BangunDatar {
    public float sisi;

    public String luas() {
        return super.luas() + " -> " + (sisi * sisi);
    }

    public String keliling() {
        return super.keliling() + " -> " + (4 * sisi);
    }
}