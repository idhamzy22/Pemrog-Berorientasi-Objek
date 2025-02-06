package Sesi2; // Menentukan nama paket

import java.text.DecimalFormat; // Import untuk format angka
import java.util.ArrayList; // Import untuk menggunakan ArrayList
import java.util.Scanner; // Import untuk input dari user

class Produk { // Kelas untuk mendefinisikan objek Produk
    int id; // ID produk
    String nama; // Nama produk
    double harga; // Harga produk
    int stok; // Stok produk

    // Constructor untuk menginisialisasi objek Produk
    public Produk(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override 
    public String toString() { // Override untuk mencetak informasi produk dalam format tabel
        // Mengatur format tabel agar kolom lebih rapi
        return String.format("| %-4d | %-22s | %-17s | %-5d |", id, nama, formatRibuan(harga), stok);
    }

    // Metode untuk memformat harga menjadi format ribuan dengan simbol Rp
    public static String formatRibuan(double angka) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Rp " + df.format(angka).replace(",", ".");
    }
}

public class SistemManajemenProduk { // Kelas utama untuk sistem manajemen produk

    // Deklarasi warna dan format teks terminal secara global
    static String green = "\u001B[32m";
    static String red = "\u001B[31m";
    static String yellow = "\u001B[33m";
    static String cyan = "\u001B[36m";
    static String reset = "\u001B[0m";
    static String bold = "\u001B[1m";

    public static void main(String[] args) throws InterruptedException { // Metode utama
        Scanner scanner = new Scanner(System.in); // Membuat scanner untuk input
        ArrayList<Produk> produkList = new ArrayList<>(); // Membuat daftar produk
        int produkIdCounter = 1; // Counter untuk ID produk
        boolean continueProgram = true; // Flag untuk melanjutkan program

        // Efek selamat datang dengan animasi loading
        showLoadingEffect("MEMUAT SISTEM", yellow);
        System.out.println(bold + cyan + "============================================" + reset);
        displayLogo(); // Memanggil metode untuk menampilkan logo
        System.out.println(bold + cyan + "============================================" + reset);

        do {
            // Menampilkan menu utama
            System.out.println(bold + yellow + "============================================" + reset);
            System.out.println(bold + green + "=====   Manajemen Produk Interaktif    =====" + reset);
            System.out.println(bold + yellow + "============================================" + reset);
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Daftar Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Cari Produk");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan input buffer

            switch (pilihan) {
                case 1: // Tambah Produk
                    System.out.print("Masukkan nama produk: ");
                    String namaProduk = scanner.nextLine();
                    System.out.print("Masukkan harga produk: ");
                    double hargaProduk = scanner.nextDouble();
                    System.out.print("Masukkan stok produk: ");
                    int stokProduk = scanner.nextInt();

                    // Menambahkan produk baru ke dalam daftar
                    produkList.add(new Produk(produkIdCounter++, namaProduk, hargaProduk, stokProduk));
                    showLoadingEffect("MENAMBAHKAN PRODUK", green);
                    System.out.println(green + "Produk berhasil ditambahkan!" + reset);
                    break;

                case 2: // Lihat Daftar Produk
                    if (produkList.isEmpty()) {
                        System.out.println(red + "Tidak ada produk yang tersedia." + reset);
                    } else {
                        System.out.println(yellow + "Daftar Produk:" + reset);
                        printTableHeader();
                        for (Produk p : produkList) {
                            System.out.println(p.toString()); // Mencetak informasi setiap produk
                        }
                        printTableFooter();
                    }
                    break;

                case 3: // Edit Produk
                    System.out.print("Masukkan ID produk yang ingin diedit: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan input buffer
                    boolean produkDitemukan = false;

                    for (Produk p : produkList) {
                        if (p.id == idEdit) { // Mencari produk berdasarkan ID
                            System.out.print("Masukkan nama produk baru: ");
                            p.nama = scanner.nextLine(); // Mengubah nama produk
                            System.out.print("Masukkan harga produk baru: ");
                            p.harga = scanner.nextDouble(); // Mengubah harga produk
                            System.out.print("Masukkan stok produk baru: ");
                            p.stok = scanner.nextInt(); // Mengubah stok produk
                            produkDitemukan = true; // Menandakan produk ditemukan
                            showLoadingEffect("MENGUPDATE PRODUK", green);
                            System.out.println(green + "Produk berhasil diupdate!" + reset);
                            break; // Keluar dari loop setelah update
                        }
                    }

                    // Pesan jika produk tidak ditemukan
                    if (!produkDitemukan) {
                        System.out.println(red + "Produk dengan ID tersebut tidak ditemukan." + reset);
                    }
                    break;

                case 4: // Hapus Produk

                    // Menghapus produk berdasarkan ID
                    System.out.print("Masukkan ID produk yang ingin dihapus: ");
                    int idHapus = scanner.nextInt();
                    produkDitemukan = false;

                    for (int i = 0; i < produkList.size(); i++) {
                        if (produkList.get(i).id == idHapus) { // Mencari produk berdasarkan ID
                            produkList.remove(i); // Menghapus produk dari daftar
                            produkDitemukan = true; // Menandakan produk ditemukan
                            showLoadingEffect("MENGHAPUS PRODUK", red);
                            System.out.println(green + "Produk berhasil dihapus!" + reset);
                            break; // Keluar dari loop setelah hapus
                        }
                    }

                    // Pesan jika produk tidak ditemukan
                    if (!produkDitemukan) {
                        System.out.println(red + "Produk dengan ID tersebut tidak ditemukan." + reset);
                    }
                    break;

                case 5: // Cari Produk

                    // Mencari produk berdasarkan nama
                    System.out.print("Masukkan nama produk yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    boolean produkDitemukanCari = false;

                    System.out.println(yellow + "Hasil Pencarian Produk:" + reset);
                    printTableHeader();
                    for (Produk p : produkList) {
                        if (p.nama.toLowerCase().contains(namaCari.toLowerCase())) {
                            System.out.println(p.toString());
                            produkDitemukanCari = true;
                        }
                    }

                    // Pesan jika produk tidak ditemukan
                    if (!produkDitemukanCari) {
                        System.out.println(red + "Produk dengan nama tersebut tidak ditemukan." + reset);
                    }
                    printTableFooter();
                    break;

                case 6: // Keluar
                    continueProgram = false;
                    break;

                default: // Jika pilihan tidak valid
                    System.out.println(red + "Pilihan tidak valid!" + reset);
            }

            // Menanyakan pengguna apakah ingin melanjutkan
            if (continueProgram) {
                System.out.print(yellow + "Apakah kamu ingin melanjutkan? (y/n): " + reset);
                String opsi = scanner.next();
                if (opsi.equalsIgnoreCase("n")) {
                    continueProgram = false; // Mengubah flag jika pengguna memilih tidak
                }
            }

        } while (continueProgram); // Loop sampai pengguna memilih untuk keluar

        showLoadingEffect("MENUTUP PROGRAM", yellow); // Efek loading saat menutup program
        System.out.println(bold + cyan + "======================================" + reset);
        System.out.println("TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM SAYA!!"); // Pesan terima kasih
        scanner.close(); // Menutup scanner
    }

    // Metode untuk mencetak header tabel
    public static void printTableHeader() {
        System.out.println("+------+------------------------+-------------------+-------+");
        System.out.println("|  ID  | Nama Produk            | Harga Produk      | Stok  |");
        System.out.println("+------+------------------------+-------------------+-------+");
    }

    // Metode untuk mencetak footer tabel
    public static void printTableFooter() {
        System.out.println("+------+------------------------+-------------------+-------+");
    }

    // Metode untuk efek loading
    public static void showLoadingEffect(String pesan, String color) throws InterruptedException {
        // Menggunakan warna dan reset global
        for (int i = 0; i < 3; i++) {
            System.out.print(color + pesan + reset + ".");
            Thread.sleep(500); // Delay untuk simulasi loading
        }
        System.out.println();
    }

    // Metode untuk menampilkan logo
    public static void displayLogo() {
        System.out.println(green + "  ___  ____    _   _      _      __  __  " + reset);
        System.out.println(green + " |_ _||  _ \\  | | | |    /_\\    |  \\/  | " + reset);
        System.out.println(green + "  | | | | | | | |_| |   // \\\\   | |\\/| | " + reset);
        System.out.println(green + "  | | | |_| | |  _  |  // _ \\\\  | |  | | " + reset);
        System.out.println(green + " |___||____/  |_| |_| //_/ \\\\_\\ |_|  |_| " + reset);
        System.out.println(" ");
    }
}