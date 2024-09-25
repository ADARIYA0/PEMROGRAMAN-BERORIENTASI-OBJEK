/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.pertemuan18.trycatchthrow;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        
        try {
            // Melempar exception jika usia kurang dari 18
            if (usia < 18) {
                throw new IllegalArgumentException("Usia harus minimal 18 tahun.");
            }
            System.out.println("Selamat, Anda sudah cukup umur.");
        } catch (IllegalArgumentException e) {
            // Menangani exception yang dilempar
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
