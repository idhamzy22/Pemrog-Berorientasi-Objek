package Sesi9.Polymorfisme.Tugas.ProgramKomputer.Abstracts;

import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Interfaces.Keyboard;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Interfaces.Mouse;
import Sesi9.Polymorfisme.Tugas.ProgramKomputer.Interfaces.Printer;

public abstract class Komputer implements Mouse, Keyboard, Printer {
    public abstract void hidupkan_os();
    public abstract void matikan_os();
}