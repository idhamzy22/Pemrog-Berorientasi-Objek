package praktikum.sesi3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulator {

    // Metode untuk Penjumlahan
    public double tambah(double a, double b) {
        return a + b; // Menjumlahkan dua angka dan mengembalikan hasilnya
    }

    // Metode untuk Pengurangan
    public double kurang(double a, double b) {
        return a - b; // Mengurangkan dua angka dan mengembalikan hasilnya
    }

    // Metode untuk Perkalian
    public double kali(double a, double b) {
        return a * b; // Mengalikan dua angka dan mengembalikan hasilnya
    }

    // Metode untuk Pembagian
    public double bagi(double a, double b) {
        if (b != 0) {
            return a / b; // Membagi dua angka jika pembagi bukan nol
        } else {
            throw new ArithmeticException("Tidak dapat membagi dengan nol"); // Menangani pembagian oleh nol
        }
    }

    // Metode untuk menghitung persentase
    public double persen(double a, double b) {
        return a * (b / 100); // Menghitung persentase dari angka pertama terhadap angka kedua
    }

    // Metode untuk simulasi loading (opsional)
    public static void loading() throws InterruptedException {
        System.out.print("Menghitung"); // Menampilkan pesan 'Menghitung'
        for (int i = 0; i < 3; i++) {
            Thread.sleep(500); // Menunda eksekusi selama 500ms untuk simulasi loading
            System.out.print("."); // Menambahkan titik untuk efek loading
        }
        System.out.println(); // Pindah ke baris baru setelah loading selesai
    }

    // Metode untuk format angka ribuan
    public static String formatRibuan(double angka) {
        DecimalFormat df = new DecimalFormat("#,##0"); // Membuat format angka dengan pemisah ribuan
        return df.format(angka).replace(",", "."); // Mengganti pemisah ribuan dari koma menjadi titik
    }

    public static void main(String[] args) {
        // ANSI escape codes untuk pewarnaan teks di terminal
        String green = "\u001B[32m"; // Warna hijau
        String red = "\u001B[31m"; // Warna merah
        String yellow = "\u001B[33m"; // Warna kuning
        String cyan = "\u001B[36m"; // Warna cyan
        String magenta = "\u001B[35m"; // Warna magenta (ungu)
        String reset = "\u001B[0m"; // Reset ke warna default terminal

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek kalkulator untuk melakukan operasi aritmatika

        // Menampilkan header kalkulator
        System.out.println(yellow + "============================================" + reset);
        System.out.println(yellow + "=====       Kalkulator Sederhana       =====" + reset);
        System.out.println(yellow + "=====      Idham Kholid Nur Azizi      =====" + reset);
        System.out.println(yellow + "============================================" + reset);

        boolean continueCalculating = true; // Variabel untuk menentukan apakah kalkulasi akan terus dilakukan
        double hasil = 0; // Variabel untuk menyimpan hasil perhitungan
        boolean firstCalculation = true; // Menandai apakah ini perhitungan pertama atau bukan

        // Perulangan untuk menjalankan kalkulasi
        while (continueCalculating) {
            double angka1;

            if (firstCalculation) { // Jika ini perhitungan pertama
                System.out.print(magenta + "Masukkan angka pertama: ");
                angka1 = scanner.nextDouble(); // Meminta input angka pertama dari pengguna
                firstCalculation = false; // Menandai bahwa perhitungan pertama sudah selesai
            } else { 
                angka1 = hasil; // Gunakan hasil perhitungan sebelumnya sebagai angka pertama
                System.out.println(magenta + "\nAngka pertama: " + formatRibuan(angka1) + reset);
            }

            System.out.print(magenta + "Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble(); // Meminta input angka kedua dari pengguna

            // Menampilkan daftar operasi yang tersedia
            System.out.println(cyan + "\nPilih operasi: ");
            System.out.println(cyan + "1. Tambah");
            System.out.println(cyan + "2. Kurang");
            System.out.println(cyan + "3. Kali");
            System.out.println(cyan + "4. Bagi");
            System.out.println(cyan + "5. Persen");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt(); // Input pilihan operasi dari pengguna

            boolean validChoice = true; // Variabel untuk mengecek apakah pilihan operasi valid atau tidak

            try {
                loading(); // Menampilkan simulasi loading
            } catch (InterruptedException e) {
                System.out.println(red + "Terjadi kesalahan saat menghitung." + reset);
            }

            // Menentukan operasi berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    hasil = kalkulator.tambah(angka1, angka2); // Operasi penjumlahan
                    break;
                case 2:
                    hasil = kalkulator.kurang(angka1, angka2); // Operasi pengurangan
                    break;
                case 3:
                    hasil = kalkulator.kali(angka1, angka2); // Operasi perkalian
                    break;
                case 4:
                    try {
                        hasil = kalkulator.bagi(angka1, angka2); // Operasi pembagian
                    } catch (ArithmeticException e) {
                        System.out.println(red + e.getMessage() + reset); // Menampilkan pesan jika terjadi pembagian oleh nol
                        validChoice = false; // Menandai bahwa pilihan tidak valid
                    }
                    break;
                case 5:
                    hasil = kalkulator.persen(angka1, angka2); // Operasi persen
                    break;
                default:
                    System.out.println(red + "Pilihan tidak valid" + reset); // Menangani input pilihan yang tidak valid
                    validChoice = false;
            }

            if (validChoice) { // Jika pilihan operasi valid, menampilkan hasil
                System.out.println(reset + "--------------------------------------");
                System.out.println(green + "Hasil: " + formatRibuan(hasil) + reset); // Menampilkan hasil perhitungan dalam format ribuan
                System.out.println(reset + "--------------------------------------");
            }

            // Tanya apakah pengguna ingin melanjutkan atau menghitung lagi
            System.out.print(yellow + "Apakah kamu ingin menghitung lagi? (y/n/r): " + reset);
            String opsi = scanner.next(); // Input pilihan apakah lanjut (y), reset (r), atau keluar (n)

            if (opsi.equalsIgnoreCase("n")) { // Jika pengguna memilih 'n', keluar dari loop
                continueCalculating = false;
            } else if (opsi.equalsIgnoreCase("r")) { // Jika pengguna memilih 'r', reset kalkulator
                firstCalculation = true; // Reset kondisi perhitungan pertama
                hasil = 0; // Reset hasil ke 0
            }
        }

        // Pesan akhir setelah pengguna selesai menggunakan kalkulator
        System.out.println(yellow + "======================================" + reset);
        System.out.println("TERIMA KASIH SEMUANYA!!!");
        scanner.close(); // Menutup objek Scanner
    }
}