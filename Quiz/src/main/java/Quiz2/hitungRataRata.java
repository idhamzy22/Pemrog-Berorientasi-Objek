package Quiz2;

public class hitungRataRata {
    public static double hitungRataRata(int[] angka) {
        int total = 0;
        for (int n : angka) {
            total += n;
        }
        return (double) total / angka.length;
    }

    public static void main(String[] args) {
        int[] nilai = {80, 90, 70, 85, 95};
        System.out.println("Rata-rata nilai adalah: " + hitungRataRata(nilai));
    }
}