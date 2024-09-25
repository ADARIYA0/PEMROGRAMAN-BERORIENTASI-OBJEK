/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan17.arraysingledimensi;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class ArraySingleDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // Meminta pengguna untuk memasukkan jumlah kota
        System.out.print("Masukan Jumlah Kota : ");
        int jumlahKota = input.nextInt();
        input.nextLine(); // Mengonsumsi newline setelah nextInt()

        // Membuat array untuk menampung nama kota
        String[] kota = new String[jumlahKota];

        // Meminta pengguna memasukkan nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + " : ");
            kota[i] = input.nextLine();
        }

        // Menampilkan kota-kota yang dimasukkan
        System.out.println("Kota-kota yang dimasukkan:");
        for (int i = 0; i < jumlahKota; i++) {
            System.out.println(kota[i]);
        }
    }
}
