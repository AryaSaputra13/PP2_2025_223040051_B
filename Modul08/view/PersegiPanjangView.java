/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.Modul08.view;

import java.awt.GridLayout;
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
public class PersegiPanjangView extends JFrame{
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    private JLabel lblLuas = new JLabel("-");
    private JLabel lblKeliling = new JLabel("-"); // Latihan 2
    private JButton btnHitung = new JButton("Hitung");
    private JButton btnReset = new JButton("Reset");
    
    public PersegiPanjangView()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLayout(new GridLayout(6, 2, 10, 10));
        this.setTitle("MVC Kalkulator");
        
        this.add(new JLabel("Panjang: "));
        this.add(txtPanjang);
        this.add(new JLabel("Lebar: "));
        this.add(txtLebar);
        this.add(new JLabel("Luas: "));
        this.add(lblLuas);
        this.add(new JLabel("Keliling: ")); //Latihan 2
        this.add(lblKeliling); //Latihan 2
        this.add(new JLabel(""));
        this.add(btnHitung);
        this.add(btnReset); //Latihan 3
    }
    
    public double getPanjang()
    {
        return Double.parseDouble(txtPanjang.getText());
    }
    
    public double getLebar()
    {
        return Double.parseDouble(txtLebar.getText());
    }
    
    public void setLuas(double hasil)
    {
        lblLuas.setText(String.valueOf(hasil));
    }
    
    //Latihan 2
    public void setKeliling(double hasil)
    {
        lblKeliling.setText(String.valueOf(hasil));
    }
    
    //Latihan 3
    public void resetInput()
    {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblLuas.setText("-");
        lblKeliling.setText("-");
    }
    
    public void tampilkanPesanError(String pesan) 
    {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    public void addHitungListener(ActionListener listener) 
    {
        btnHitung.addActionListener(listener);
    }
    
    public void addResetListener(ActionListener listener) 
    {
        btnReset.addActionListener(listener);
    }
}
