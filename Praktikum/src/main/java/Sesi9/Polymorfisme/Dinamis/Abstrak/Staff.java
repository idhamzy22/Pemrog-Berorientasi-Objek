package Sesi9.Polymorfisme.Dinamis.Abstrak;

public class Staff extends Pegawai {
    final private String bagian;

    public Staff (String NIP, String nama, String bagian) {
        super(NIP, nama);
        this.bagian = bagian;
    }

    public String getBagian(){
        return bagian;
    }

    @Override
    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println(getNama() + " mengirim email ke " + to + " dengan subjek " + subjek + " dan isi " + isi);
    }
}