package Sesi6.restoran.Koki;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String nama;
    private String id;
    private Chef chef;
    private List<Menu> menuList;

    public Customer(String nama, String id) {
        this.nama = nama;
        this.id = id;
        this.menuList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void addMenu(Menu menu) {
        if (!menuList.contains(menu)) {
            menuList.add(menu);
            menu.addCustomer(this); // Relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Nama Customer: " + nama);
        System.out.println("ID Customer: " + id);
        System.out.println("Chef: " + (chef != null ? chef.getNama() : "Belum Ada"));
        System.out.println("Menu yang Dipesan:");
        for (Menu menu : menuList) {
            System.out.println("- " + menu.getNama());
        }
    }
}