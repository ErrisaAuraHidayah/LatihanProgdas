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
public class Presensi10 {
    public static void main (String[] args){
        kondisi();
        array();
    }
    static void kondisi(){
        boolean zonahijau=true;
        
        if(zonahijau == true){
            System.out.println("Laksanakan protokol kesehatan di sekolah");
        }else{
            System.out.println("Mohon Maaf zona wilayah anda belum bisa untuk melaksanakan pembelajaran di sekolah ");
            System.out.println("Tetapi mohon tetap lakukan ini dimanapun anda berada");
        }
    }
    static void array(){
        String[] pesan ={".","Memakai masker","Cek suhu tubuh", "Selalu Mencuci tangan","Siap sedia Handsanitizer","Selalu Jaga jarak","Jaga imun"};
        
        for(int  i = 1; i<7; i++){
            System.out.println(i+ "." +pesan[i]);
    }
        }
    
    }    
    

