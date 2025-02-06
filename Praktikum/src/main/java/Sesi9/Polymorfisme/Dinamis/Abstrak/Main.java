package Sesi9.Polymorfisme.Dinamis.Abstrak;

public class Main
{
    public static void main( String[] args )
    {
        Staff staff = new Staff("456", "Jane Doe", "HR");
        staff.kirimEmail("u0g0M@example.com", "Info Test", "Test Email");
        System.out.println("NIP : " + staff.getNIP() + "\nNama : " + staff.getNama() + "\nBagian : " + staff.getBagian());
    }
}