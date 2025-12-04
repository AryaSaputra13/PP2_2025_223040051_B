/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul05;

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
public class Latihan3 {
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                JFrame frame = new JFrame("Jendela naon");
                JLabel label = new JLabel("Abcd");
                JButton button = new JButton("Next");
                
                frame.setSize(400, 300);
                frame.add(label);
                frame.add(button);
                frame.setLayout(new FlowLayout());
                
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                    System.out.println("Tombol diklik");
//                    }
//                });

                button.addActionListener(e -> {
                    label.setText("AWOKWKWKWKW");
                });
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
