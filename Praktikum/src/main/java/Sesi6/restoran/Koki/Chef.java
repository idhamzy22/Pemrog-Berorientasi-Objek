package Sesi6.restoran.Koki;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private String nama;
    private String id;
    private List<Customer> customerList;

    public Chef(String nama, String id) {
        this.nama = nama;
        this.id = id;
        this.customerList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void tambahCustomer(Customer customer) {
        if (!customerList.contains(customer)) {
            customerList.add(customer);
            customer.setChef(this); // Relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Nama Chef: " + nama);
        System.out.println("ID Chef: " + id);
        System.out.println("Customer yang Dilayani:");
        for (Customer customer : customerList) {
            System.out.println("- " + customer.getNama());
        }
    }
}