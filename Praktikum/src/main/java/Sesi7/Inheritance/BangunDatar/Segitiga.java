package Sesi7.Inheritance.BangunDatar;

public class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public String luas() {
        return super.luas() + " -> " + (0.5 * alas * tinggi);
    }

    public String keliling() {
        return super.keliling() + " -> " + (alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi));
    }
}