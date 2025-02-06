package Quiz4.Soal1.Inheritance;

// Class Dosen
public class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    // Setter
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void view() {
        System.out.println("NIK Dosen: " + nik);
        System.out.println("Nama Dosen: " + nama);
    }
}