/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul03;

/**
 *
 * @author Arya
 */
public class programSiswa {
    public static void main(String[] args)
    {
        siswa siswa1 = new siswa("Jane Doe", "10A", "26102025");
        siswa siswa2 = new siswa("Jhon Doe", "10A", "01112025");
        
        siswa1.infoSiswa();
        siswa2.infoSiswa();
    }
}
