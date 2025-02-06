package Sesi4;

// Membuat Class dengan nama BintangFilm
public class BintangFilm {
    // Atributnya
    private String nama;
    private Boolean pria;

    // Konstruktor: fungsi yang dijalankan ketika objek diciptakan
    public BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method tanpa return dengan parameter
    private void isikan(String nama, Boolean pria) {
        this.nama = nama; // this adalah objek sekarang
        this.pria = pria;
    }

    // Method dengan return tanpa parameter
    public String perolehNama() {
        return nama;
    }

    // Memperoleh Jenis Kelamin tanpa parameter
    public String perolehJenisKelamin() {
        if (pria)
            return "Pria";
        else
            return "Wanita";
    }
}

// Kelas untuk menjalankan program utama
class ClassBintangFilm {
    public static void main(String[] args) {
        // Buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}