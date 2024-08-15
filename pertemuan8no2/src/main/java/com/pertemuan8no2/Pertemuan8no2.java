/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan8no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan8no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int akhir = input.nextInt();
        
        System.out.print("Tahun Awal ?: ");
        int awal = input.nextInt();
        
        System.out.println("Hasil nya :");
        for (int i=akhir; i>=awal; i--) {
            System.out.println(i);
        }
    }
}
