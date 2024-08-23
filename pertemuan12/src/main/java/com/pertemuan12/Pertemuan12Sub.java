/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan12;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan12Sub extends Pertemuan12Super {
    
    private int gaji = 4000000;
    private int bonus = 1000000;
    
    public int total() {
        return gaji + bonus + tunjangan + transport;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pertemuan12Sub Main = new Pertemuan12Sub();
        
        System.out.println("Gaji System Analyst : " + Main.gaji);
        System.out.println("Bonus : " + Main.bonus);
        
        // Memanggil method tampilkan pada file Pertemuan12Super
        Main.tampilkan();
        
        System.out.println("Gaji Total : " + Main.total());
    }
}
