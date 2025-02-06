package Sesi7.Inheritance.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;

    public String luas() {
        return super.luas() + " -> " + (panjang * lebar);
    }

    public String keliling() {
        return super.keliling() + " -> " + (2 * (panjang + lebar));
    }
}