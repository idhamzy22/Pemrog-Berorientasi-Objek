package Sesi6.tugas.quiz;

public class MainAT {
    public static void main(String[] args) {
        // Creating objects for each type of item
        AlatTulis bolpoin = new AlatTulis();
        bolpoin.setNama("Bolpoin");
        bolpoin.setStok(10);
        bolpoin.setHargaSatuan(2000);

        AlatTulis pensil = new AlatTulis();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        AlatTulis penghapus = new AlatTulis();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        // Display information for each item
        bolpoin.tampilkanInfo();
        pensil.tampilkanInfo();
        penghapus.tampilkanInfo();

        // Calculate and display the total income if all items are sold
        AlatTulis[] items = {bolpoin, pensil, penghapus};
        int totalHarga = AlatTulis.hitungTotalHarga(items);
        System.out.println("Total Harga: " + totalHarga);
    }
}