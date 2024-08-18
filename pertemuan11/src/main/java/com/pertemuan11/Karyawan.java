/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan11;

/**
 *
 * @author anugerahworkplus
 */

public class Karyawan {
    
    int idkaryawan;
    String namakaryawan;
    String golongan;
    String jabatanpekerjaan;
    int gajipokok;
    
    Karyawan (int id, String nama, String gol, String jabatan, int gaji) {
        this.idkaryawan = id;
        this.namakaryawan = nama;
        this.golongan = gol;
        this.jabatanpekerjaan = jabatan;
        this.gajipokok = gaji;
    }
    
    void info() {
        System.out.println("ID Karyawan: " + idkaryawan);
        System.out.println("Nama: " + namakaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatanpekerjaan);
        System.out.println("Gaji: " + gajipokok);
    }
}
