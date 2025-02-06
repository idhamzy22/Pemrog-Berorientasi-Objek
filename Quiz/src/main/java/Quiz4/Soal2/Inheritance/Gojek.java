package Quiz4.Soal2.Inheritance;

import Quiz4.Soal2.Interfaces.Transportasi;

// Superclass Gojek yang mengimplementasikan interface Transportasi
public class Gojek implements Transportasi {
    // Atribut
    private int harga;
    private int id;

    // Constructor
    public Gojek(int id, int harga) {
        this.id = id;
        this.harga = harga;
    }

    // Implementasi metode dari interface
    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        System.out.println("Data Gojek telah diatur.");
    }

    @Override
    public int getId() {
        return id;
    }
}