package Quiz4.Soal3.Main;

import Quiz4.Soal3.Interfaces.Phone;
import Quiz4.Soal3.Inheritance.Samsung;
import Quiz4.Soal3.Inheritance.Xiaomi;
import Quiz4.Soal3.Inheritance.iPhone;
import Quiz4.Soal3.Inheritance.Oppo;
import Quiz4.Soal3.Inheritance.PhoneUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu untuk memilih jenis handphone
        System.out.println("Pilih jenis handphone:");
        System.out.println("1. Samsung");
        System.out.println("2. Xiaomi");
        System.out.println("3. iPhone");
        System.out.println("4. Oppo");
        System.out.print("Pilihan Anda: ");
        int phoneChoice = input.nextInt();

        Phone phone;
        switch (phoneChoice) {
            case 1:
                phone = new Samsung();
                break;
            case 2:
                phone = new Xiaomi();
                break;
            case 3:
                phone = new iPhone();
                break;
            case 4:
                phone = new Oppo();
                break;
            default:
                System.out.println("Pilihan tidak valid. Default ke Samsung.");
                phone = new Samsung();
        }

        PhoneUser user = new PhoneUser(phone);

        // Menu aksi untuk handphone
        System.out.println("\nPilih aksi:");
        System.out.println("1. Nyalakan HP");
        System.out.println("2. Matikan HP");
        System.out.println("3. Perbesar Volume");
        System.out.println("4. Perkecil Volume");
        System.out.println("0. Keluar");

        int choice;
        do {
            System.out.print("Pilihan Anda: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    user.turnOnThePhone();
                    break;
                case 2:
                    user.turnOffThePhone();
                    break;
                case 3:
                    user.makePhoneLouder();
                    break;
                case 4:
                    user.makePhoneSilent();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (choice != 0);

        input.close();
    }
}