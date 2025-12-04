/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul08.model;

/**
 *
 * @author Arya
 */
public class PersegiPanjangModel {
    private double panjang;
    private double lebar;
    private double luas;
    private double keliling;
    
    public void hitungLuas() 
    {
        this.luas = this.panjang * this.lebar;
    }
    
    public void setPanjang(double panjang) 
    {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) 
    {
        this.lebar = lebar;
    }
    
    public double getLuas()
    {
        return luas;
    }
    
    //Latihan 2
    public void hitungKeliling()
    {
        this.keliling = 2 * (panjang + lebar);
    }
    
    public double getKeliling()
    {
        return keliling;
    }
    
}
