/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan18.trycatchthrow;

/**
 *
 * @author anugerahworkplus
 */
public class TryCatch {

    public static void main(String[] args) {
        try {
            // Membuat operasi pembagian
            int hasil = 10 / 0; // Ini akan menimbulkan ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            // Menangkap dan menangani exception
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }

        // Program tetap berjalan meskipun terjadi exception
        System.out.println("Program selesai.");
    }
}
