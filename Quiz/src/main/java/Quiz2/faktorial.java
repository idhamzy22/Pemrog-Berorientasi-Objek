package Quiz2;

public class faktorial {
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 4;
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial(angka));
    }
}