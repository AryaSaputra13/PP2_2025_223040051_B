/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
/**
 *
 * @author Arya
 */
public class Tugas_Modul5_PP2_223040051_B {
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                JFrame frame = new JFrame("Border Layout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame.setLayout(new BorderLayout());
                
                JLabel label = new JLabel("Label ada di atas (NORTH)");
                JButton buttonSouth = new JButton("Tombol ada di bawah (SOUTH)");                
                JButton buttonWest = new JButton("WEST");
                JButton buttonEast = new JButton("EAST");
                JButton buttonCenter = new JButton("CENTER");

                buttonSouth.addActionListener(e -> {
                    label.setText("Tombol di SOUTH diklik!");
                });

                buttonWest.addActionListener(e -> {
                    label.setText("Tombol di WEST diklik!");
                });

                buttonEast.addActionListener(e -> {
                    label.setText("Tombol di EAST diklik!");
                });

                buttonCenter.addActionListener(e -> {
                    label.setText("Tombol di CENTER diklik!");
                });
                   
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);
                
                frame.setVisible(true);
            }
        });
    }
}
