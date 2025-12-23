/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.TugasModul10;

import id.ac.unpas.TugasModul10.View.MahasiswaView;
import id.ac.unpas.TugasModul10.Controller.MahasiswaController;
/**
 *
 * @author Arya
 */

public class main {
    public static void main(String[] args) {
        MahasiswaView view = new MahasiswaView();
        new MahasiswaController(view);
        view.setVisible(true);
    }
}

