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
public class Fungsi {
    public static void main(String[] args){
        System.out.println("Menghitung Luas Persegi Panjang");
        
        int panjang = 5;
        int lebar =8;
        
        int hasilnya = Luas(panjang,lebar);
        System.out.println("Luas persegi panjang adalah "+panjang+ "*"+lebar+ "=" +hasilnya ); 
    }
    static int Luas(int p , int l){
        
        int luas;
        luas = p * l;
        return luas;
        
    }
}
