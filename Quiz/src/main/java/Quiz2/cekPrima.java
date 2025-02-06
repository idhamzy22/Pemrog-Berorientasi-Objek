package Quiz2;

public class cekPrima {
    public static boolean cekPrima(int angka) {
        if (angka <= 1) return false;
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) return false;
        }
        return true;
    }

    public static void cetakPrima(int batasAtas) {
        for (int i = 2; i <= batasAtas; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int batasAtas = 10;
        System.out.println("Bilangan prima hingga " + batasAtas + ":");
        cetakPrima(batasAtas);
    }
}