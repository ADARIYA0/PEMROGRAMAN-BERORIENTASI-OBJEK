/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan10no2;

/**
 *
 * @author anugerahworkplus
 */
public class Aritmatika1 {
    int angka, angka1, angka2, angka3, angka4 = 10;
    
    void setAngka(int perangka) {
        angka = angka + perangka;
        angka1 = angka - perangka;
        angka2 = angka * perangka;
        angka3 = angka / perangka;
        angka4 = angka ^ perangka;
    }
    
    int getAngka() {
        return angka;
    }
    
    int getPengurangan() {
        return angka1;
    }
    
    int getPerkalian() {
        return angka2;
    }
    
    int getPembagian() {
        return angka3;
    }
    
    int getPerpangkatan() {
        return angka4;
    }
}
