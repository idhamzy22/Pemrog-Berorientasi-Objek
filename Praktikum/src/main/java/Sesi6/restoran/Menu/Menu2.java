package Sesi6.restoran.Menu;

public class Menu2 {
    private String nama;
    private String kode;
    private double harga;

    public Menu2(String nama, String kode, double harga) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public double getHarga() {
        return harga;
    }

    public void displayInfo() {
        System.out.println("Nama Menu: " + nama);
        System.out.println("Kode Menu: " + kode);
        System.out.println("Harga: " + harga);
    }
}