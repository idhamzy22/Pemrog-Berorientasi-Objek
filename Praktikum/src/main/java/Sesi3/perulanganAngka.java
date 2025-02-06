package Sesi3;
import java.util.Scanner;

public class perulanganAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        // Perulangan untuk meminta angka sampai pengguna memasukkan angka 0
        do {
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = scanner.nextInt();
        } while (angka != 0);

        // Menutup scanner
        scanner.close();
        System.out.println("Program berhenti.");
    }
}