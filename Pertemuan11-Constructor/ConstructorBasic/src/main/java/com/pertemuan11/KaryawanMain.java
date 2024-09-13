/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan11;

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

        System.out.print("Masukkan Golongan: ");
        String golongan = input.nextLine();

        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok: ");
        int gaji = input.nextInt();

        Karyawan objek = new Karyawan(id, nama, golongan, jabatan, gaji);
        objek.info();
    }
}
