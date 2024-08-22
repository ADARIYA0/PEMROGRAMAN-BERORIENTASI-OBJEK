/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan11no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class KaryawanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ID Karyawan: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan (1-5): ");
        int golongan = input.nextInt();

        // Tidak perlu lagi meminta input jabatan dan gaji pokok, karena sudah ditentukan otomatis
        Karyawan objek = new Karyawan(id, nama, golongan);
        objek.info();
    }
}
