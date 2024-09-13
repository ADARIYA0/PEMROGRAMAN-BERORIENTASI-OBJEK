/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan10;

/**
 *
 * @author anugerahworkplus
 */
public class Aritmatika3 {

    int angka;
    int angka1;
    int angka2;
    int angka3;
    int angka4;
    
    void setAngka(int a, int b) {
        angka = a+b;
        angka1 = a-b;
        angka2 = a*b;
        angka3 = a/b;
        angka4 = a^b;
    }
    
    int getTambah() {
        return angka;
    }
    
    int getKurang() {
        return angka1;
    }
    
    int getKali() {
        return angka2;
    }
    
    int getBagi() {
        return angka3;
    }
    
    int getPangkat() {
        return angka4;
    }
}
