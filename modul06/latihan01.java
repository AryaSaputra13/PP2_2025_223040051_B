/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arya
 */
public class latihan01 {
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(5, 5));

        JTextField layar = new JTextField();
        layar.setEditable(false);
        layar.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(layar, BorderLayout.NORTH);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));

        String[] tombol = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String teks : tombol) 
        {
            JButton btn = new JButton(teks);
            panelTombol.add(btn);
        }

        frame.add(panelTombol, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
