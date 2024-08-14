/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan6.pertemuan6no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan6no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM : ");
        int nim = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        
        if (nilai>=85 && nilai<100) {
            System.out.println("grade A");
            System.out.println("Keterangan : Lulus");
        } else if (nilai>=75 && nilai<85) {
            System.out.println("grade B");
            System.out.println("Keterangan : Lulus");
        } else if (nilai>=65 && nilai<75) {
            System.out.println("grade C");
            System.out.println("Keterangan : Lulus");
        } else if (nilai > 100) {
            System.out.println("Maksimal hanya 100");
        } else {
            System.out.println("Mohon maaf, anda dinyatakan tidak lulus.");
        }
        
        /**
         * Sama seperti sebelumnya namun disini ditambahkan output
           Keterangan dari nilai yang kita sudah masukkan sebelumnya, diantara
           lulus atau tidak lulus. Jika ingin lulus, maka kita harus
           mendapatkan nilai diatas 65.
         */
    }
}
