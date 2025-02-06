package Quiz4.Soal3.Inheritance;

import Quiz4.Soal3.Interfaces.Phone;

public class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume++;
            }
            System.out.println("Volume iPhone: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume--;
            }
            System.out.println("Volume iPhone: " + volume);
        }
    }
}