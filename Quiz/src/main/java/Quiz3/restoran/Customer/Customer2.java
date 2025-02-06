package Quiz3.restoran.Customer;

public class Customer2 {
    private String nama;
    private String id;
    private int usia;

    public Customer2(String nama, String id, int usia) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void displayInfo() {
        System.out.println("Nama Customer: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Usia: " + usia);
    }
}