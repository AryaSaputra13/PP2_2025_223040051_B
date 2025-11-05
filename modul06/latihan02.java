/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Arya
 */
public class latihan02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField();
        JButton tombolKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasilFahrenheit = new JLabel("");

        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(tombolKonversi);
        frame.add(new JLabel(""));
        frame.add(labelFahrenheit);
        frame.add(hasilFahrenheit);

        tombolKonversi.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    String teksCelcius = inputCelcius.getText();
                    double celcius = Double.parseDouble(teksCelcius);
                    double fahrenheit = (celcius * 9 / 5) + 32;
                    hasilFahrenheit.setText(String.format("%.2f °F", fahrenheit));
                } 
                catch (NumberFormatException ex) 
                {  
                    JOptionPane.showMessageDialog(frame, 
                        "Input harus berupa angka!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
