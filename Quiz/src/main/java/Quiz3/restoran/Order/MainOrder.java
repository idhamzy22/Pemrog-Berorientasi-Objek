package Quiz3.restoran.Order;

import Quiz3.restoran.Menu.Menu2;
import Quiz3.restoran.Customer.Customer2;

public class MainOrder {
    public static void main(String[] args) {
        // Membuat objek Customer
        Customer2 customer1 = new Customer2("Candini", "P001", 25);

        // Membuat objek Menu
        Menu2 menu1 = new Menu2("Nasi Goreng", "M101", 25000);
        Menu2 menu2 = new Menu2("Ayam Bakar", "M102", 30000);

        // Membuat objek Order
        Order order1 = new Order(customer1);

        // Menambahkan menu ke dalam pesanan
        order1.addMenu(menu1);
        order1.addMenu(menu2);

        // Menampilkan data pesanan
        order1.displayInfo();
    }
}