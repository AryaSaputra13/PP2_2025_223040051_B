/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul04;

/**
 *
 * @author Arya
 */
public class kendaraan {
    protected String merk;
    protected int tahun;
    
    public kendaraan(String merk, int tahun) 
    {
        this.merk = merk;
        this.tahun = tahun;
    }
    public void klakson() 
    {
        System.out.println("Tin Tin!");
    }
    public void info() 
    {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}
