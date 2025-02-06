package Quiz4.Soal2.Inheritance;

// Subclass Bayar yang meng-extend superclass Gojek
public class Bayar extends Gojek {
    // Atribut tambahan
    private int jarak;
    private int total;
    private String nama;

    // Constructor
    public Bayar(int id, int harga, int jarak, String nama) {
        super(id, harga);
        this.jarak = jarak;
        this.nama = nama;
        this.total = hitungTotal();
    }

    // Method untuk menghitung total
    private int hitungTotal() {
        return jarak * 1000; // Misalkan tarif per km = 1000
    }

    // Override metode tampil
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total: Rp " + total);
    }

    @Override
    public void setData() {
        System.out.println("Data pembayaran telah diatur.");
    }
}