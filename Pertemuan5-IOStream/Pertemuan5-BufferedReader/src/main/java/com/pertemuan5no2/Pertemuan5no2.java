/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan5no2;

/**
 *
 * @author anugerahworkplus
 */

// Latihan dari soal sebelumnya.

/* 
 * (Sama seperti soal sebelumnya, hanya merubah tipe data variabel nya)
 */

import java.util.Scanner;

public class Pertemuan5no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka untuk panjang dari alas segitiga: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan angka untuk panjang dari luas segitiga: ");
        double luas = input.nextDouble();
        
        System.out.println("Luas Segitiga : " + alas);
        System.out.println("Luas Segitiga : " + luas);
    }
}
