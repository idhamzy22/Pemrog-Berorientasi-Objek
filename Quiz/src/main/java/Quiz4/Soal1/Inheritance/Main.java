package Quiz4.Soal1.Inheritance;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Objek untuk class Dosen
        Dosen dosen = new Dosen("11111", "Dr. Suryani");
        System.out.println("=== Data Dosen ===");
        dosen.view();
        dosen.setNama("Dr. Ranny Meilisa"); // Ubah nama dosen
        System.out.println("Nama sudah diubah: " + dosen.getNama());

        System.out.println();

        // Objek untuk class Rektor
        Rektor rektor = new Rektor("22222", "Prof. Arief", 2010);
        System.out.println("=== Data Rektor ===");
        rektor.viewRektor();
        rektor.setTahunMasuk(2015); // Ubah tahun masuk
        System.out.println("Tahun Masuk sudah diubah: " + rektor.getTahunMasuk());

        System.out.println();

        // Objek untuk class Dekan
        Dekan dekan = new Dekan("33333", "Dr. Dwi", "Fakultas Ilmu Komputer");
        System.out.println("=== Data Dekan ===");
        dekan.viewDekan();
        dekan.setFakultas("Fakultas Ekonomi Bisnis"); // Ubah fakultas
        System.out.println("Fakultas sudah diubah: " + dekan.getFakultas());
    }
}