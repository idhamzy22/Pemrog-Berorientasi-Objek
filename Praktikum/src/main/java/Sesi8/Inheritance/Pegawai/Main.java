package Sesi8.Inheritance.Pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat sebuah object
        // "Pegawai" merupakan class, lalu "Pegawai" merupakan objek yang akan dibuat, lalu "new Pegawai();" merupakan constructor.
        Pegawai Pegawai = new Pegawai();
        Manager Manager = new Manager();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        // Memasukkan nilai variabel menggunakan objek
        Manager.nama = "Sifa";
        Manager.id_pegawai = 1;
        Manager.gaji = "7 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2 Juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 Juta";
        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 2;
        Satpam.gaji = "1 Juta";

        // Nilai tersebut akan dimasukkan ke dalam variabel yang ada pada superclass.
        // Memanggil fungsi pada superclass
        Pegawai.menampilkan();

        // Memanggil nilai variabel pada superclass dan memasukkannya ke dalam fungsi yang ada pada class
        Manager.menampilkan();
        Manager.tugas();

        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}