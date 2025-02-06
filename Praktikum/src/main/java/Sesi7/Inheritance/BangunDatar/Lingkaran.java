package Sesi7.Inheritance.BangunDatar;

public class Lingkaran extends BangunDatar {
    public float jari;

    public String luas() {
        return super.luas() + " -> " + (3.14 * jari * jari);
    }

    public String keliling() {
        return super.keliling() + " -> " + (2 * 3.14 * jari);
    }
}