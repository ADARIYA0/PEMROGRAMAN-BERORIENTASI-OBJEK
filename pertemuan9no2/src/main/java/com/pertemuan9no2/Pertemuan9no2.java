/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan9no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan9no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan awal : ");
        int awal = input.nextInt();
        
        System.out.print("Masukkan bilangan akhir : ");
        int akhir = input.nextInt();
        
        System.out.print("Hasil deret bilangan : ");
        while (awal<=akhir) {
            System.out.print(awal + ", ");
            awal +=5;
        }
    }
}
