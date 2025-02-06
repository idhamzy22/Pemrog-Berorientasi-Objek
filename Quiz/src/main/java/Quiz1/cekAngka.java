package Quiz1;

import java.util.Scanner;

public class cekAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka tersebut adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }

        // Menutup scanner
        scanner.close();
    }
}