/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.pertemuan16.protectedmodifier;

/**
 *
 * @author anugerahworkplus
 */
class Pengurangan extends ProtectedModifier {
    protected Pengurangan(double A, double B) {
        super(A, B);
    }

    protected double hitung() {
        return A - B;
    }
}
