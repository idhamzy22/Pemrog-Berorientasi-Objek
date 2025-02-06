package Quiz2;

import java.util.Calendar;

public class hitungUmur {
    public static int hitungUmur(int tahunLahir) {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        return tahunSekarang - tahunLahir;
    }

    public static void main(String[] args) {
        int tahunLahir = 2004;
        System.out.println("Umur Anda adalah: " + hitungUmur(tahunLahir) + " tahun.");
    }
}