package Quiz3.restoran.Koki;

import Quiz3.restoran.Koki.Chef;
import Quiz3.restoran.Menu.Menu; // Sesuaikan nama package sesuai dengan lokasi kelas Menu
import Quiz3.restoran.Customer.Customer; // Sesuaikan nama package sesuai dengan lokasi kelas Customer

public class MainChef {
    public static void main(String[] args) {
        // Membuat objek Chef
        Chef chef1 = new Chef("Idham", "C001");

        // Membuat objek Menu
        Menu menu1 = new Menu("Nasi Goreng", "M101");
        Menu menu2 = new Menu("Ayam Bakar", "M102");

        // Membuat objek Customer
        Customer customer1 = new Customer("Candini", "P001");
        Customer customer2 = new Customer("Azizi", "P002");

        // Menetapkan chef dan menambahkan customer
        chef1.tambahCustomer(customer1);
        chef1.tambahCustomer(customer2);

        // Menambahkan menu yang dipesan oleh customer
        customer1.addMenu(menu1);
        customer1.addMenu(menu2);
        customer2.addMenu(menu1);

        // Menampilkan informasi chef, customer, dan menu
        System.out.println("Informasi Chef:");
        chef1.displayInfo();

        System.out.println("\nInformasi Customer:");
        customer1.displayInfo();
        customer2.displayInfo();

        System.out.println("\nInformasi Menu:");
        menu1.displayInfo();
        menu2.displayInfo();
    }
}