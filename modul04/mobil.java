/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul04;

/**
 *
 * @author Arya
 */
public class mobil extends kendaraan{
    private int jumlahPintu;
    
    public mobil(String merk, int tahun, int jumlahPintu) 
    {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void info()
    {
        super.info();
        System.out.println("Jumlah Pintu: "+jumlahPintu);
    }
}
