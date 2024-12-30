package model;

import java.util.ArrayList;
import java.util.List;

public class PakaianService {
    

    public List<Pakaian> getAllPakaian() {

        ArrayList<Pakaian> listPakaian = new ArrayList<>();

        // Menambahkan 15 pakaian secara statis
        listPakaian.add(new Pakaian("T-Shirt", "Uniqlo", 150000));
        listPakaian.add(new Pakaian("Jeans", "Levi's", 600000));
        listPakaian.add(new Pakaian("Hoodie", "Adidas", 500000));
        listPakaian.add(new Pakaian("Jacket", "The North Face", 1200000));
        listPakaian.add(new Pakaian("Kaos Kaki", "Nike", 50000));
        listPakaian.add(new Pakaian("Sepatu", "Converse", 750000));
        listPakaian.add(new Pakaian("Kemeja", "Zara", 350000));
        listPakaian.add(new Pakaian("Dress", "H&M", 450000));
        listPakaian.add(new Pakaian("Celana Pendek", "Bershka", 250000));
        listPakaian.add(new Pakaian("Sweater", "Pull&Bear", 400000));
        listPakaian.add(new Pakaian("Blazer", "Mango", 700000));
        listPakaian.add(new Pakaian("Topi", "New Era", 250000));
        listPakaian.add(new Pakaian("Celana Panjang", "Levi's", 550000));
        listPakaian.add(new Pakaian("Jaket Kulit", "Puma", 1300000));
        listPakaian.add(new Pakaian("Syal", "Uniqlo", 150000));

        return listPakaian;
    }

    public void viewAllPakaian() {
        List<Pakaian> listPakaian = getAllPakaian();
        for (Pakaian pakaian : listPakaian) {
            System.out.println(pakaian.toString());
        }
    }

    public void menu(){
        System.out.println("Menu:");
        System.out.println("1. Lihat Pakaian");
        System.out.println("2. Beli Pakaian");
        System.out.println("3. Keluar");
    }

}
