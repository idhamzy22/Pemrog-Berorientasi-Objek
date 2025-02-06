package Quiz2;

public class hitungKata {
    public static int hitungKata(String kalimat) {
        if (kalimat == null || kalimat.isEmpty()) {
            return 0;
        }
        String[] kata = kalimat.split("\\s+");
        return kata.length;
    }

    public static void main(String[] args) {
        String kalimat = "Belajar Java itu menyenangkan dan menarik";
        System.out.println("Jumlah kata: " + hitungKata(kalimat));
    }
}