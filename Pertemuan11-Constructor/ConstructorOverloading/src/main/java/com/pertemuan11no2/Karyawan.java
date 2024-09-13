/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan11no2;

/**
 *
 * @author anugerahworkplus
 */
public class Karyawan {

        int idkaryawan;
        String namakaryawan;
        int golongan;
        String jabatanpekerjaan;
        int gajipokok;
    
    Karyawan (int id, String nama, int gol) {
        this.idkaryawan = id;
        this.namakaryawan = nama;
        this.golongan = gol;
    
    
    switch (golongan) {
        case 1 -> {
            this.jabatanpekerjaan = "Assisten Staff";
            this.gajipokok = 40000000;
        }
        
        case 2 -> {
            this.jabatanpekerjaan = "Staff";
            this.gajipokok = 3500000;
        }
        
        case 3 -> {
            this.jabatanpekerjaan = "Supervisor";
            this.gajipokok = 4000000;
        }
        
        case 4 -> {
            this.jabatanpekerjaan = "Asisten Manager";
            this.gajipokok = 5000000;
        }
        
        case 5 -> {
            this.jabatanpekerjaan = "Manager";
            this.gajipokok = 6000000;
        }
        
        default -> {
            this.jabatanpekerjaan = "Data tidak ada, maka gaji 0";
            this.gajipokok = 0;
        }
    }
}
    
    void info() {
        System.out.println("ID Karyawan: " + idkaryawan);
        System.out.println("Nama: " + namakaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatanpekerjaan);
        System.out.println("Gaji: " + gajipokok);
    }
}
