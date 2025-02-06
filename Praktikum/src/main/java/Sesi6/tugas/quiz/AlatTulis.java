package Sesi6.tugas.quiz;

public class AlatTulis {
    // Attributes
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        hitungHargaTotal();  // Update harga total setiap kali stok diubah
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        hitungHargaTotal();  // Update harga total setiap kali harga satuan diubah
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    // Method to calculate the total price of each item (stok * hargaSatuan)
    private void hitungHargaTotal() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }

    // Method to display information of the item
    public void tampilkanInfo() {
        System.out.println("Nama Alat Tulis : " + nama);
        System.out.println("Stok           : " + stok);
        System.out.println("Harga Satuan   : " + hargaSatuan);
        System.out.println("Harga " + nama + " : " + hargaTotal);
        System.out.println();
    }

    // Static method to calculate total price if all items are sold
    public static int hitungTotalHarga(AlatTulis[] items) {
        int total = 0;
        for (AlatTulis item : items) {
            total += item.getHargaTotal();
        }
        return total;
    }
}