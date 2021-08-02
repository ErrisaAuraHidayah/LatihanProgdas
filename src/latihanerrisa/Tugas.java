/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanerrisa;

import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class Tugas {
    public static void main (String[] args){
        String nama, smp;
        int suhu;
        
        nama ="Errisa Aura Hidayah";
        smp = "SMPN 2 Jember";
        
        System.out.println("Nama  "+nama);
        System.out.println("Asal SMP = "+smp);
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan suhu badan anda: ");
        suhu= input.nextInt();
        
        if( suhu <37) {
            System.out.println("Saya Sehat, Saya Kuat, dan Saya Bermanfaat!!!");
        } else {
            System.out.println("Maaf Anda Harus Istirahat");
            
        
          
         
    }
        
        

                
        
        
        
    }
    
    
}
