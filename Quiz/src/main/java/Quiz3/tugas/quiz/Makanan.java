package Quiz3.tugas.quiz;

public class Makanan {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    // Constructor
    public Makanan(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = stok * hargaSatuan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk stok
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
        updateHargaTotal();
    }

    // Getter dan Setter untuk harga satuan
    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        updateHargaTotal();
    }

    // Getter untuk harga total
    public int getHargaTotal() {
        return hargaTotal;
    }

    // Method untuk update harga total
    private void updateHargaTotal() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }
}