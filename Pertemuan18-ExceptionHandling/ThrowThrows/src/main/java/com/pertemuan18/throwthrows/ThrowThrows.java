/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan18.throwthrows;

/**
 *
 * @author anugerahworkplus
 */
public class ThrowThrows {

    public static void main(String[] args) {
        try{
            //below code do not throw any exception
            float data=500/15;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("blok finally akan selalu di eksekusi");
        }
    }
}

// 33.0
// blok finally akan selalu di eksekusi