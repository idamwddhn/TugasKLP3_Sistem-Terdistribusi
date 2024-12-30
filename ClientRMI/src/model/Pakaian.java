package model;

import java.io.Serializable;

public class Pakaian implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nama;

    private String merek;

    private double harga;

    public Pakaian() {
    }

    public Pakaian(String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Pakaian [nama=" + this.nama + ", merek=" + this.merek + ", harga=" + this.harga + "]";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
