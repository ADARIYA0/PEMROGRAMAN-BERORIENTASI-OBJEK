/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan7;

/**
 *
 * @author anugerahworkplus
 */
public class Pertemuan7 {

    public static void main(String[] args) {
        int day = 2; // Memasukkan variabel integer yang bernilai 2 untuk switch
        switch (day) {
            case 1:
                System.out.println("Sabtu");
                break;
            case 2:
                System.out.println("Minggu");
                break;
                
            /**
             * Tipe data switch mirip-mirip dengan if, if else, dan else if. Namun ada perbedaan dari
               yang sebelumnya, yakni adanya tambahan kata "case" pada tipe data switch. Jadi pemilihan nilainya
               digunakan dari nilai variabel yang sudah kita masukkan sebelumnya, yang nanti si data switch
               ini akan memilih dari "case" yang sesuai dengan nilai variabel kita masukkan sebelumnya.
             * Nilai switch dihasilkan dari tipe char, byte, short, int, atau String dan diapit
               menggunakan tanda kurung.
             * Contohnya ada pada diatas komen ini, yang dimana ada integer variabel day bernilai 2. Setelah itu
               switch akan memilih case yang ke-2 karena sesuai dengan nilai variabelnya, dan outputnya
               akan memunculkan hari "Minggu".
             * Kegunaan break yaitu ketika switch akan diakhiri oleh suatu output atau tipe data lain.
               (Sifatnya opsional)
             *
             * Catatan tambahan: Nilai case bisa dimasukkan sesuai dengan apa yang akan kita
               masukkan. Kita juga bisa memasukkan pernyataan default (Opsional) jika tidak ada satupun case
               yang sudah ditetapkan sesuai dengan ekspresi switch. Jika kita tidak memasukkan pernyataan default,
               maka output tidak akan menampilkan apa-apa.
             */
        }
    }
}
