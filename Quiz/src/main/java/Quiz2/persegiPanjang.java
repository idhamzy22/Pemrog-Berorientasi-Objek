package Quiz2;

public class persegiPanjang {
    public static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int panjang = 10, lebar = 5;
        System.out.println("Keliling persegi panjang: " + hitungKeliling(panjang, lebar));
        System.out.println("Luas persegi panjang: " + hitungLuas(panjang, lebar));
    }
}