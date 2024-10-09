# Kalkulator Sederhana dengan Java

**Author**: Idham Kholid Nur Azizi

## Deskripsi
Program ini merupakan kalkulator sederhana berbasis CLI (Command Line Interface) yang ditulis menggunakan bahasa pemrograman Java. Kalkulator ini mendukung operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, pembagian, dan persentase. Program ini juga menyediakan format tampilan hasil dengan angka ribuan serta simulasi "loading" untuk memberikan pengalaman interaktif kepada pengguna.

## Fitur Utama
- **Penjumlahan (`+`)**: Menambah dua angka yang dimasukkan.
- **Pengurangan (`-`)**: Mengurangi angka kedua dari angka pertama.
- **Perkalian (`*`)**: Mengalikan dua angka yang dimasukkan.
- **Pembagian (`/`)**: Membagi angka pertama dengan angka kedua (tidak dapat membagi dengan nol).
- **Persentase (`%`)**: Menghitung persentase dari angka pertama terhadap angka kedua.
- **Format Ribuan**: Hasil dari operasi ditampilkan dalam format ribuan dengan titik sebagai pemisah.
- **Simulasi Loading**: Efek "menghitung..." untuk memberikan pengalaman pengguna yang lebih dinamis.
- **Operasi Berulang**: Program dapat melanjutkan perhitungan dengan hasil operasi sebelumnya.
- **Reset**: Memulai perhitungan baru dengan angka yang di-reset.

## Cara Penggunaan Program

1. Jalankan program di terminal atau command prompt.
2. Program akan meminta Anda untuk memasukkan angka pertama.
3. Masukkan angka kedua setelahnya.
4. Pilih operasi yang diinginkan dari daftar:
    - `1` untuk penjumlahan
    - `2` untuk pengurangan
    - `3` untuk perkalian
    - `4` untuk pembagian
    - `5` untuk persentase
5. Program akan menampilkan hasil dari operasi yang dipilih dengan format ribuan.
6. Anda akan diminta untuk melanjutkan:
    - `y` untuk menghitung lagi dengan hasil sebelumnya sebagai angka pertama.
    - `n` untuk keluar dari program.
    - `r` untuk mereset dan memulai perhitungan dari awal.
7. Ulangi langkah-langkah di atas sesuai kebutuhan Anda.

## Contoh Output

```bash
============================================
=====       Kalkulator Sederhana       =====
=====      Idham Kholid Nur Azizi      =====
============================================
Masukkan angka pertama: 1000
Masukkan angka kedua: 500

Pilih operasi: 
1. Tambah
2. Kurang
3. Kali
4. Bagi
5. Persen
Pilihan: 1
Menghitung...
--------------------------------------
Hasil: 1.500
--------------------------------------
Apakah kamu ingin menghitung lagi? (y/n/r): y

Angka pertama: 1.500
Masukkan angka kedua: 200

Pilih operasi: 
1. Tambah
2. Kurang
3. Kali
4. Bagi
5. Persen
Pilihan: 2
Menghitung...
--------------------------------------
Hasil: 1.300
--------------------------------------
Apakah kamu ingin menghitung lagi? (y/n/r): n

======================================
TERIMA KASIH SEMUANYA!!!