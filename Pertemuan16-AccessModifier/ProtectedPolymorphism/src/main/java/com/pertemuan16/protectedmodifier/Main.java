/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.pertemuan16.protectedmodifier;

/**
 *
 * @author anugerahworkplus
 */
public class Main {
    public static void main(String[] args) {
        // Inisialisasi bilangan A dan B
        double A = 9.5;
        double B = 2.5;

        // Membuat objek dari kelas turunan dan melakukan operasi aritmatika
        ProtectedModifier penjumlahan = new Penjumlahan(A, B);
        ProtectedModifier pengurangan = new Pengurangan(A, B);
        ProtectedModifier perkalian = new Perkalian(A, B);
        ProtectedModifier pembagian = new Pembagian(A, B);

        // Menampilkan hasil dari masing-masing operasi
        System.out.println("Penjumlahan: " + penjumlahan.hitung());
        System.out.println("Pengurangan: " + pengurangan.hitung());
        System.out.println("Perkalian: " + perkalian.hitung());
        System.out.println("Pembagian: " + pembagian.hitung());
    }
}
