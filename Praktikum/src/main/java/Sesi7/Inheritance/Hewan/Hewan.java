package Sesi7.Inheritance.Hewan;

public class Hewan {
    protected String suara;

    public Hewan() {
        this.suara = "suara";
    }

    public void cetak() {
        System.out.println("Hewan Bersuara" + suara);
    }
}

class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia() {
        this.berkembangbiak = "beranak";
    }

    public void cetak() {
        System.out.println("Mamalia berkembang biak " + berkembangbiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi() {
        suara = "Hemoh..";
        berkembangbiak = "Beranak";
        this.nama = "Sopi";
        this.umur = "1";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Mamalia Sapi =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Berkembang Biak : " + berkembangbiak);
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur + " tahun");
    }
}

class Kambing extends Mamalia {
    private String nama;
    private String umur;

    public Kambing() {
        suara = "Embek....";
        berkembangbiak = "Beranak";
        this.nama = "Si Ling";
        this.umur = "2";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Mamalia Kambing =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Berkembang Biak : " + berkembangbiak);
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur + " tahun");
    }
}

class Unggas extends Hewan {
    protected String berkembangBiak;

    public Unggas() {
        this.berkembangBiak = "Bertelur";
    }

    public void cetak() {
        System.out.println("Bertelur");
    }
}

class Burung extends Unggas {
    private String jenis;
    private String ciri;

    public Burung() {
        suara = "Mbekur...";
        berkembangBiak = "bertelur";
        this.jenis = "Merpati";
        this.ciri = "Bulu putih";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Unggas Burung =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Berkembang Biak : " + berkembangBiak);
        System.out.println("Jenis           : " + jenis);
        System.out.println("Ciri            : " + ciri);
    }
}

class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam() {
        suara = "Petok-Petok...";
        berkembangBiak = "bertelur";
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu Bercorak Putih Hitam";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Unggas Ayam =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Berkembang Biak : " + berkembangBiak);
        System.out.println("Jenis           : " + jenis);
        System.out.println("Ciri            : " + ciri);
    }
}

class Ikan extends Hewan {
    protected String napas;

    public Ikan() {
        this.napas = "insang";
    }

    public void cetak() {
        System.out.println("Insang");
    }
}

class Gurami extends Ikan {
    private String Ciri;
    private String Berat;

    public Gurami() {
        suara = "-----";
        napas = "insang";
        this.Ciri = "Berwarna Hitam";
        this.Berat = "2";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Ikan Gurami =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Bernapas        : " + napas);
        System.out.println("Ciri            : " + Ciri);
        System.out.println("Berat           : " + Berat + " kg");
    }
}

class Lele extends Ikan {
    private String ciri; // Changed from Ciri to ciri
    private String berat; // Changed from Berat to berat

    public Lele() {
        suara = "------";
        napas = "insang";
        this.ciri = "Berwarna Hitam Keputihan";
        this.berat = "3";
    }

    public void cetak() {
        System.out.println("======= Data Hewan Ikan Lele =======");
        System.out.println("Suara           : " + suara);
        System.out.println("Bernapas        : " + napas);
        System.out.println("Ciri            : " + ciri);
        System.out.println("Berat           : " + berat + " kg");
    }
}

class Pewarisan {
    public static void main(String[] args) {
        Sapi sp1 = new Sapi();
        sp1.cetak();

        System.out.println("");
        Kambing kmb1 = new Kambing();
        kmb1.cetak();

        System.out.println("");
        Burung brg1 = new Burung();
        brg1.cetak();

        System.out.println("");
        Ayam aym1 = new Ayam();
        aym1.cetak();

        System.out.println("");
        Gurami grm1 = new Gurami();
        grm1.cetak();

        System.out.println("");
        Lele ll1 = new Lele();
        ll1.cetak();
    }
}