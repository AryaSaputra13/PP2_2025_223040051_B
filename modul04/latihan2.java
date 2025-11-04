/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul04;

/**
 *
 * @author Arya
 */
public class latihan2 {
    public static void main(String[] args) {
        System.out.println("--- Info Bangun Datar (Polimorfisme) ---");

        bangunDatar bangun1 = new persegi(5.0, "Hitam");
        bangun1.cetakInfo();

        if (bangun1 instanceof dapatDiwarnai) {
            ((dapatDiwarnai) bangun1).warnai("Merah");
        }

        System.out.println("--------------------");

        bangunDatar bangun2 = new lingkaran(3.0);
        bangun2.cetakInfo();

        System.out.println("--------------------");
    }
}
