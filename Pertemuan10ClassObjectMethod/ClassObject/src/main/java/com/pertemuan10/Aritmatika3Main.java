/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan10;

/**
 *
 * @author anugerahworkplus
 */
public class Aritmatika3Main {
    public static void main(String[] args) {
        Aritmatika3 aritmatikaku = new Aritmatika3();
        int a = 10, b = 20;
        aritmatikaku.setAngka(a,b);
        System.out.println("Bilangan 1= " +a);
        System.out.println("Bilangan 2= " +b);
        System.out.println("Hasil Pertambahan " + aritmatikaku.getTambah());
        System.out.println("Hasil Pengurangan " + aritmatikaku.getKurang());
        System.out.println("Hasil Perkalian " + aritmatikaku.getKali());
        System.out.println("Hasil Pembagian " + aritmatikaku.getBagi());
        System.out.println("Hasil Perpangkatan " + aritmatikaku.getPangkat());
    }
}
