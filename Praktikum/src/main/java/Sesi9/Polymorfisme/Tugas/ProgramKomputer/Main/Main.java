package Sesi9.Polymorfisme.Tugas.ProgramKomputer.Main;

import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Classes.Laptop;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Classes.Netbook;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Classes.PC;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.FinalClass.KomputerCetak;

public class Main {
    public static void main(String[] args) {
        Komputer[] komputerList = {
            new PC(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(komputerList);
    }
}