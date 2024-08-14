/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan5;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner; // Import/tambahkan library class Scanner

public class Pertemuan5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat Scanner object
        
        // Membaca input, yang nantinya akan bisa kita tulis pada keyboard
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        
        System.out.print("Usia: ");
        int usia = input.nextInt();

        System.out.print("Gaji: ");
        int gaji = input.nextInt();
        
        System.out.println("### Pendataan Karyawan PT. Petani Kode");
        // Output dari input yang sudah kita masukkan sebelumnya
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: " + gaji);
        
        /**
         * Catatan bahwa data print ada 3 namun disini saya akan menjelsakannya 2 saja,
         * yakni ada print dan println, perbedaannya dari kedua tersebut hanyalah
         * sebuah baris, untuk println akan membuat baris baru sedangkan print
         * tidak membuat baris baru atau hanya 1 baris saja.
        */
    }
}
