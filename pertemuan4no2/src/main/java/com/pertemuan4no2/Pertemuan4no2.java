/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan4no2;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan4no2 {

    public static void main(String[] args) {
        int w = 5;
        int x = 6;
        int y = 8 - x++;
        int z = 8 - ++w;
        
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        /**
         * Perbedaannya dari kedua auto increment pada variabel y dan z tersebut adalah
           keduanya sama-sama auto increment, namun
         * data "++w" atau pre-increment pada nilai variabel z akan ditambahkan 1 terlebih dahulu, 
           kemudian hasilnya digunakan. Contohnya pada variabel z, disitu ada pre-inrecement juga,
           yang dimana variabel w ditambahkan 1 terlebih dahulu yaitu menjadi 6, lalu w = 6.
         * Sedangkan data "x++" atau post-increment pada nilai variabel y akan digunakan terlebih dahulu,
           baru kemudian ditambahkan 1. Contohnya seperti pada variabel y. Yang dimana variabel x = 6 akan 
           didahulukan terlebih dahulu, lalu x akan ditambahkan 1 menjadi 7.
        */
    }
}
