/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul03;

/**
 *
 * @author Arya
 */
public class programBuku {
    public static void main(String[] args) {
        
        buku buku1 = new buku("Pemrograman Java", "Joseph", 250);

        buku1.getInfoBuku();
        buku1.setHalaman(300);
        buku1.setHalaman(-50);

        //buku1.jumlahHalaman = 500;
    }
}
