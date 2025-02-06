package Sesi5;

public class WaktuTester {
    
    static class Waktu {
        private int menitWaktu; // Menyimpan total waktu dalam menit

        // Constructor
        public Waktu() {
            this.menitWaktu = 0;
        }

        // Menambahkan jam ke waktu (j * 60 menit)
        public void tambahJam(int j) {
            this.menitWaktu += j * 60;
        }

        // Menambahkan menit ke waktu
        public void tambahMenit(int m) {
            this.menitWaktu += m;
        }

        // Menambahkan jam dan menit ke waktu
        public void tambahWaktu(int j, int m) {
            this.menitWaktu += (j * 60) + m;
        }

        // Menampilkan waktu dalam format jam dan menit
        public void tampilWaktu() {
            int jam = menitWaktu / 60;
            int menit = menitWaktu % 60;
            System.out.println(jam + " jam " + menit + " menit");
        }
    }

    public static void main(String[] args) {
        // Membuat objek Waktu pertama dan menambah waktu
        Waktu waktu1 = new Waktu();
        waktu1.tambahWaktu(2, 30); // Menambahkan 2 jam 30 menit
        waktu1.tampilWaktu();       // Output: 2 jam 30 menit

        // Membuat objek Waktu kedua dan menambah waktu
        Waktu waktu2 = new Waktu();
        waktu2.tambahWaktu(3, 45); // Menambahkan 3 jam 45 menit
        waktu2.tampilWaktu();       // Output: 3 jam 45 menit
    }
}