/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan8;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai Awal ?: ");
        int awal = input.nextInt();
        
        System.out.print("Nilai Akhir ?: ");
        int akhir = input.nextInt();
        
        for (int i=awal; i<=akhir; i+=5) {
            System.out.println(i);
        }
    }
}
