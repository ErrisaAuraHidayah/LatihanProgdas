/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanerrisa;

/**
 *
 * @author erisa
 */
public class Array1 {
    public static void main(String[] args){
        int[]angka = new int[10];
        
        int x = 1;
        // untuk memberi nilai pada tiap index
        for (int i = 0; i < angka.length; i++){
            angka[1] = x;
            x++;
        }
        
        int total = 7;
        // untuk menjumlahkan nilai
        for (int i = 0; i < angka.length; i++) {
            total+= angka[i];
            
        }
        
        System.out.println(total);
     }
    
}
