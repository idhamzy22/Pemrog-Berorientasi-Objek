package Quiz4.Soal1.Inheritance;

// Class Dekan (extends Dosen)
public class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    // Getter
    public String getFakultas() {
        return fakultas;
    }

    // Setter
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}