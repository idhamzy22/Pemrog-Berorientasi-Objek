package Quiz4.Soal4.hewan;

// Interface AnimalBehavior
interface AnimalBehavior {
    void displayInfo(); // Menampilkan informasi hewan
}

// Abstract Class Animal
abstract class Animal implements AnimalBehavior {
    private String nama, sifat;
    private int ukuran;

    // Constructor
    public Animal(String nama, int ukuran, String sifat) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.sifat = sifat;
    }

    // Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }

    // Abstract method wajib diimplementasikan
    public abstract void displayInfo();
}

// Class Mamalia
class Mamalia extends Animal {
    private String jalan, jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia(String nama, int ukuran, String sifat, boolean bisaJalan, int jumlahKaki, String jenisMamalia) {
        super(nama, ukuran, sifat);
        this.bisaJalan = bisaJalan;
        this.jumlahKaki = jumlahKaki;
        this.jenisMamalia = jenisMamalia;
    }

    // Setter dan Getter
    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    // Implementasi abstract method
    @Override
    public void displayInfo() {
        System.out.println("Mamalia: " + getNama() + ", Ukuran: " + getUkuran() + ", Sifat: " + getSifat());
        System.out.println("Bisa Jalan: " + bisaJalan + ", Jumlah Kaki: " + jumlahKaki + ", Jenis: " + jenisMamalia);
    }
}

// Class Aves
class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves(String nama, int ukuran, String sifat, boolean bisaTerbang, String jenisAves) {
        super(nama, ukuran, sifat);
        this.bisaTerbang = bisaTerbang;
        this.jenisAves = jenisAves;
    }

    // Setter dan Getter
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void displayInfo() {
        System.out.println("Aves: " + getNama() + ", Ukuran: " + getUkuran() + ", Sifat: " + getSifat());
        System.out.println("Bisa Terbang: " + bisaTerbang + ", Jenis: " + jenisAves);
    }
}

// Subclass Ayam dari Aves
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam(String nama, int ukuran, String sifat, boolean bisaTerbang, String jenisAves, String jenisAyam, boolean bisaDiadu) {
        super(nama, ukuran, sifat, bisaTerbang, jenisAves);
        this.jenisAyam = jenisAyam;
        this.bisaDiadu = bisaDiadu;
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Ayam: " + jenisAyam + ", Bisa Diadu: " + bisaDiadu);
    }
}

// Subclass Merpati dari Aves
final class Merpati extends Aves {
    public Merpati(String nama, int ukuran, String sifat, boolean bisaTerbang, String jenisAves) {
        super(nama, ukuran, sifat, bisaTerbang, jenisAves);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ini adalah Merpati yang spesifik.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Mamalia sapi = new Mamalia("Sapi", 200, "Jinak", true, 4, "Herbivora");
        Aves burung = new Aves("Elang", 30, "Agresif", true, "Burung Pemangsa");
        Ayam ayamAduan = new Ayam("Ayam Jago", 5, "Lincah", false, "Unggas", "Ayam Bangkok", true);
        Merpati merpatiPos = new Merpati("Merpati Pos", 2, "Cepat", true, "Burung Pos");

        // Menampilkan Informasi
        System.out.println("=== Informasi Hewan ===");
        sapi.displayInfo();
        System.out.println();
        burung.displayInfo();
        System.out.println();
        ayamAduan.displayInfo();
        System.out.println();
        merpatiPos.displayInfo();
    }
}