/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul04;

/**
 *
 * @author Arya
 */
public class persegi extends bangunDatar implements dapatDiwarnai {
    private double sisi;
    private String warna;

    public persegi(double sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void warnai(String warna) {
        System.out.println("Persegi diwarnai " + warna);
    }

    @Override
    public void cetakInfo() {
        System.out.println("Ini adalah Persegi, Warna: " + warna + ", Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
    }
}
