/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan10no2;

/**
 *
 * @author anugerahworkplus
 */
public class Aritmatika3Main {

    public static void main(String[] args) {
        Aritmatika1 aritmatikaku = new Aritmatika1();
        aritmatikaku.setAngka(20);
        System.out.println("Hasil Pertambahan " + aritmatikaku.getAngka());
        System.out.println("Pengurangan: " + aritmatikaku.getPengurangan());
        System.out.println("Perkalian: " + aritmatikaku.getPerkalian());
        System.out.println("Pembagian: " + aritmatikaku.getPembagian());
        System.out.println("Perpangkatan: " + aritmatikaku.getPerpangkatan());
        
    }
}
