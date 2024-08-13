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
        System.out.println("Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.println("Alamat: ");
        String alamat = input.nextLine();
        
        System.out.println("Usia: ");
        int usia = input.nextInt();

        System.out.println("Gaji: ");
        int gaji = input.nextInt();
        
        System.out.println("### Pendataan Karyawan PT. Petani Kode");
        // Output dari input yang sudah kita masukkan sebelumnya
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: " + gaji);
    }
}
