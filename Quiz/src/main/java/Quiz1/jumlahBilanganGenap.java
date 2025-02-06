package Quiz1;

public class jumlahBilanganGenap {
    public static void main(String[] args) {
        int jumlah = 0;

        // Perulangan for untuk menghitung bilangan genap antara 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }

        // Menampilkan hasil jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlah);
    }
}