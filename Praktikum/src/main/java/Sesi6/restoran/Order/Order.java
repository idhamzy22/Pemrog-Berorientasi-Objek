package Sesi6.restoran.Order;

import Sesi6.restoran.Menu.Menu2;
import Sesi6.restoran.Customer.Customer2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer2 customer;
    private List<Menu2> menuList;

    public Order(Customer2 customer) {
        this.customer = customer;
        this.menuList = new ArrayList<>();
    }

    public void addMenu(Menu2 menu) {
        if (!menuList.contains(menu)) {
            menuList.add(menu);
        }
    }

    public void displayInfo() {
        System.out.println("Customer: " + customer.getNama());
        System.out.println("Menu yang Dipesan:");
        for (Menu2 menu : menuList) {
            System.out.println("- " + menu.getNama() + " (" + menu.getHarga() + ")");
        }
    }
}