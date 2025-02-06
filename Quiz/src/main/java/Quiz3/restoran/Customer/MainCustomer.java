package Quiz3.restoran.Customer;

import Quiz3.restoran.Customer.Customer2;

public class MainCustomer {
    public static void main(String[] args) {
        // Membuat objek Customer
        Customer2 customer1 = new Customer2("Idham", "P001", 30);

        // Menampilkan data Customer
        customer1.displayInfo();

        // Mengubah data Customer
        customer1.setNama("Azizi");
        customer1.setId("P002");
        customer1.setUsia(28);

        // Menampilkan data setelah diubah
        customer1.displayInfo();
    }
}