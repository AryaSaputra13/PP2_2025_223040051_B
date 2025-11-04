/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul03;

/**
 *
 * @author Arya
 */
public class buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public buku(String judul, String penulis, int jumlahHalaman) 
    {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void getInfoBuku() 
    {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }

    public int getHalaman() 
    {
        return jumlahHalaman;
    }

    public void setHalaman(int halamanBaru) 
    {
        if (halamanBaru > 0) 
        {
            this.jumlahHalaman = halamanBaru;
            System.out.println("Jumlah halaman berhasil diubah menjadi: " + halamanBaru);
        } 
        else 
        {
            System.out.println("Error: Jumlah halaman harus lebih besar dari 0!");
        }
    }
}
