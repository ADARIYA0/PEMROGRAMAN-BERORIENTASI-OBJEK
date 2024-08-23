/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.pertemuan13no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan13no2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Pertemuan13no2 objek = new Pertemuan13no2();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan alas segitiganya : ");
        int alas = input.nextInt();
        
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = input.nextInt();
        
        System.out.println("Luas segitiganya adalah : " + objek.luasSegitiga(alas, tinggi));
    }
}
