package praktikum.sesi4;
import java.util.Scanner;

public class hurufDigit {
    /**
    * @param args
    */

    public static void main(String[] args) {
        // MEMBUAT VARIABLE DAN SCANNER
        char karakter;
        Scanner scan = new Scanner(System.in);

        // MENGAMBIL INPUT
        System.out.print("MASUKKAN SEBUAH KARAKTER : ");
        karakter = scan.nextLine().charAt(0);

        // MEMERIKSA JENIS KARAKTER
        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println(karakter + " ADALAH HURUF");
        } else if (karakter >= '0' && karakter <= '9') {
            System.out.println(karakter + " ADALAH DIGIT");
        } else {
            System.out.println(karakter + " BUKAN HURUF ATAU DIGIT");
        }

        // Menutup Scanner
        scan.close();
    }
}