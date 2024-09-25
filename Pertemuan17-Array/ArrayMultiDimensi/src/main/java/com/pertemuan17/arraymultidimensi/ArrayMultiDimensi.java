/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan17.arraymultidimensi;

/**
 *
 * @author anugerahworkplus
 */
public class ArrayMultiDimensi {
    public static void main(String[] args) {
        // Inisialisasi array multidimensi untuk menyimpan negara dan ibu kotanya
        String[][] nib = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan negara dan ibu kotanya
        for (int i = 0; i < nib.length; i++) {
            System.out.println("Ibukota " + nib[i][0] + " adalah " + nib[i][1]);
        }
    }
}
