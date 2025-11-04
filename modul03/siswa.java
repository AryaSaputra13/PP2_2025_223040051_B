/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul03;

/**
 *
 * @author Arya
 */
public class siswa {
    private String nama;
    private String kelas;
    private String nis;
    
    public siswa(String nama, String kelas, String nis)
    {
        this.nama = nama;
        this.kelas = kelas;
        this.nis = nis;
    }
    
    public void infoSiswa()
    {
        System.out.println("Nama: " + nama + ", Kelas: " + kelas + ", Nis: " + nis);
    }
}
