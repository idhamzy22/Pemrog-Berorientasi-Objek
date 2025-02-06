package Quiz3.restoran.Koki;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nama;
    private String kode;
    private List<Customer> customerList;

    public Menu(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.customerList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public void addCustomer(Customer customer) {
        if (!customerList.contains(customer)) {
            customerList.add(customer);
            customer.addMenu(this); // Relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Menu: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Daftar Customer:");
        for (Customer customer : customerList) {
            System.out.println("- " + customer.getNama());
        }
    }
}