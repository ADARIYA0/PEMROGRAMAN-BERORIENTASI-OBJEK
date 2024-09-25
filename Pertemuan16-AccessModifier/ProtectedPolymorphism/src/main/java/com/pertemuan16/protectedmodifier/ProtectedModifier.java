/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan16.protectedmodifier;

/**
 *
 * @author anugerahworkplus
 */
class ProtectedModifier {
    protected double A;
    protected double B;

    // Konstruktor untuk inisialisasi nilai A dan B
    protected ProtectedModifier(double A, double B) {
        this.A = A;
        this.B = B;
    }
    
    // Method untuk operasi, akan di-override oleh kelas turunan
    protected double hitung() {
        return 0.0;
    }
}
