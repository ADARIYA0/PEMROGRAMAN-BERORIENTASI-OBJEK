/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan4;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan4 {

    public static void main(String[] args) {
        // Variabel untuk angka1 dan 2
        int angka1, angka2;
        angka1 = 10;
        angka2 = 3;
        
        // Variabel baru untuk sebelumnya
        int penambahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        double pembagian = (double) angka1 / angka2;
        
        /**
         *  Akan menghasilkan output pertambahan, pengurangan, perkalian, dan pembagian dari 
            nilai variabel sebelumnya
         */
        System.out.println("Hasil Pertambahan A+B = " + penambahan);
        System.out.println("Hasil Pengurangan A-B = " + pengurangan);
        System.out.println("Hasil Perkalian A*B = " + perkalian);
        System.out.println("Hasil Pembagian A/B = " + pembagian);
    }
}
