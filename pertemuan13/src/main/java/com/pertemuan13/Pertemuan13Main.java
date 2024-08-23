/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.pertemuan13;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan13Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Pertemuan13 objek = new Pertemuan13();
        
        System.out.println("Hasil Pertambahan : " + objek.tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + objek.kurang(20, 10));
        System.out.println("Hasil Perkalian : " + objek.kali(20, 10));
        System.out.println("Hasil Pembagian : " + objek.bagi(20, 10));
    }
}
