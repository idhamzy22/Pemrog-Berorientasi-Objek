package Quiz2;

public class menghitungPangkat {
    public static int pangkat(int base, int eksponen) {
        int hasil = 1;
        for (int i = 0; i < eksponen; i++) {
            hasil *= base;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int base = 5, eksponen = 3;
        System.out.println(base + " pangkat " + eksponen + " adalah: " + pangkat(base, eksponen));
    }
}