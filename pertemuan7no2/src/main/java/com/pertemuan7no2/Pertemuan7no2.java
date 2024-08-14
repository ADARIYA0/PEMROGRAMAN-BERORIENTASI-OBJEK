/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan7no2;

/**
 *
 * @author anugerahworkplus
 */
import java.util.Scanner;

public class Pertemuan7no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NIM  :  ");
        int nim = input.nextInt();
        input.nextLine();
        
        System.out.print("NAMA :  ");
        String nama = input.nextLine();
        
        System.out.print("TAHUN : ");
        int tahun = input.nextInt();
        input.nextLine();
        
        if (tahun > 4) {
            System.out.println("Belum ada data untuk tahun ini.");
            return;  // Menghentikan eksekusi program jika user input memasukkan angka tahun lebih dari 4
        }
        
        if (tahun == 1) {
            System.out.println("BAHASA INGGRIS, MATEMATIKA, SAIN");
        } else {
            System.out.print("PILIH PERMINTAAN (C/E/M) :  ");
            char peminatan = input.nextLine().charAt(0);
        
            switch (tahun) {
                case 2:
                    switch (peminatan) {
                        case 'C':
                            System.out.println("SISTEM OPERASI, PEMROGRAMAN JAVA, STRUKTUR DATA");
                            break;
                        case 'E': 
                            System.out.println("ALGORITMA, LOGIKA INFORMATIKA");
                            break;
                        case 'M':
                            System.out.println("DBMS,MANAJEMEN PROYEK   ");
                            break;
                    }
                    break;
                case 3:
                    switch (peminatan) {
                        case 'C':
                            System.out.println("ORGANISASI KOMPUTER, MULTIMEDIA");
                            break;
                        case 'E':
                            System.out.println("PERANCANGAN SISTEM, PEMROGRAMAN WEB");
                            break;
                        case 'M':
                            System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                            break;
                    }
                    break;
                case 4:
                    switch (peminatan) {
                        case 'C':
                            System.out.println("KOMUNIKASI DATA, MULTIMEDIA");
                            break;
                        case 'E':
                            System.out.println(" SISTEM TERDISTRIBUSI , IMAGE PROCESSING");
                            break;
                        case 'M':
                            System.out.println("SIM , SISTEM JARINGAN");
                            break;
                    }
                    break;
            }
        }
    }
}
