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
public class Array2 {
    public static void main (String[] args){
     
        boolean zonahijau = true;
        
     
        // pertama buat array nya
        String[] pesan ={".","Pakai masker","Cek suhu tubuh", "Mencuci tangan","Siap Handsanitizer","Jaga jarak","Jaga imun"};
        
        //percabangan
        if (zonahijau){
            System.out.println("Pesan jika zona hijau masuk sekolah");
        }
        //Perulangan
        for(int  i = 1; i<7; i++){
            System.out.println(i+ "." +pesan[i]);  
        }
                
                }
    
}
