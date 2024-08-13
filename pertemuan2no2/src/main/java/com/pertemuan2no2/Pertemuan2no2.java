/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan2no2;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan2no2 {

    // Membuat variabel tanpa value/nilai pada class static variabel
    public static String Makanan;
    
    public static final String Minuman = "Jus Jambu";
    
    public static void main(String[] args) {
        Makanan = "Ayam Geprek"; // Mengisi value pada variable Makanan yang sebelumnya belum ada
        System.out.println("Makanan Favorit Saya : " + Makanan); // Memanggil variabel Makanan
        System.out.println("Minuman Favorit Saya : " + Minuman); // Memanggil variabel Minuman
    }
}
