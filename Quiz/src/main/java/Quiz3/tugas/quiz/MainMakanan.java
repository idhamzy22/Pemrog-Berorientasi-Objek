package Quiz3.tugas.quiz;

public class MainMakanan {
    public static void main(String[] args) {
        // Membuat objek Makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 5, 15000);
        Makanan makanan2 = new Makanan("Mie Ayam", 10, 12000);
        Makanan makanan3 = new Makanan("Sate Ayam", 7, 20000);

        // Menampilkan data makanan
        tampilkanMakanan(makanan1);
        tampilkanMakanan(makanan2);
        tampilkanMakanan(makanan3);

        // Menghitung dan menampilkan total harga semua makanan
        int totalHarga = makanan1.getHargaTotal() + makanan2.getHargaTotal() + makanan3.getHargaTotal();
        System.out.println("Total Harga: " + totalHarga);
    }

    // Method untuk menampilkan detail setiap makanan
    public static void tampilkanMakanan(Makanan makanan) {
        System.out.println("Nama Makanan   : " + makanan.getNama());
        System.out.println("Stok           : " + makanan.getStok());
        System.out.println("Harga Satuan   : " + makanan.getHargaSatuan());
        System.out.println("Harga " + makanan.getNama() + " : " + makanan.getHargaTotal());
        System.out.println();
    }
}