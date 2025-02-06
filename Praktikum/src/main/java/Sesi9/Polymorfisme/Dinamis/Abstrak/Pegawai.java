package Sesi9.Polymorfisme.Dinamis.Abstrak;

public abstract class Pegawai {
    final private String NIP, nama;

    public Pegawai(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return nama;
    }

    public void kirimEmail(String to, String subjek, String isi){
        System.out.println(getNama() + " mengirim email ke " + to + " dengan subjek " + subjek + " dan isi " + isi);
    }
}