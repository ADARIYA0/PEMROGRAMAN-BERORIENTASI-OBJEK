/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kalkulatorpack;

/**
 *
 * @author anugerahworkplus
 */
public class kalkulator {

    public int pertambahan(int a, int b) {
        return a+b;
    }
    
    public int pengurangan(int a, int b) {
        return a-b;
    }
    
    public float pembagian(float a, float b) {
        return a/b;
    }
    
    public float perkalian(float a, float b) {
        return a*b;
    }
    
    public static void main(String args[]) {
        kalkulator objek = new kalkulator();
        System.out.println(objek.pertambahan(10, 20));
        System.out.println(objek.pengurangan(10, 20));
        System.out.println(objek.pembagian(10, 20));
        System.out.println(objek.perkalian(10, 20));
    }
}
