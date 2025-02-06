package Quiz4.Soal3.Inheritance;

import Quiz4.Soal3.Interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume Xiaomi sekarang: " + volume);
            } else {
                System.out.println("Volume sudah maksimal!");
            }
        } else {
            System.out.println("Hidupkan Xiaomi terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume Xiaomi sekarang: " + volume);
            } else {
                System.out.println("Volume sudah minimal!");
            }
        } else {
            System.out.println("Hidupkan Xiaomi terlebih dahulu.");
        }
    }
}