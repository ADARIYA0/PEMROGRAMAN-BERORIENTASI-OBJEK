/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan6;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan6 {

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
        } else if (nilai>=75 && nilai<85) {
            System.out.println("grade B");
        } else if (nilai>=65 && nilai<75) {
            System.out.println("grade C");
        } else if (nilai > 100) {
            System.out.println("Maksimal hanya 100");
        } else {
            System.out.println("Mohon maaf, anda dinyatakan tidak lulus.");
        }
        
        /**
         * Pertama-tama, jika kita memsukkan nilai 85-100, maka akan mendapatkan grade A.
         * Lalu jika kita memasukkan nilainya dibawah 85, maka kita akan mendapatkan grade B dan C,
           atau mungkin kita akan dinyatakan tidak lulus jika dubawah 65.
         */
    }
}
