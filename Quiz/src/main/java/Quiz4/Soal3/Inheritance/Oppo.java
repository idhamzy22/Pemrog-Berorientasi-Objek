package Quiz4.Soal3.Inheritance;

import Quiz4.Soal3.Interfaces.Phone;

public class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume Oppo sekarang: " + volume);
            } else {
                System.out.println("Volume sudah maksimal!");
            }
        } else {
            System.out.println("Hidupkan Oppo terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume Oppo sekarang: " + volume);
            } else {
                System.out.println("Volume sudah minimal!");
            }
        } else {
            System.out.println("Hidupkan Oppo terlebih dahulu.");
        }
    }
}