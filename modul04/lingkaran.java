/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul04;

/**
 *
 * @author Arya
 */
public class lingkaran extends bangunDatar {
    private double radius;

    public lingkaran(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() 
    {
        return Math.PI * radius * radius;
    }

    @Override
    public void cetakInfo() 
    {
        System.out.println("Ini adalah Lingkaran, Radius: " + radius);
        System.out.println("Luas: " + hitungLuas());
    }
}
