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
import java.util.Scanner;
public class Fungsi1 {
    
    static void namanya(String nama){
        
        System.out.println("Hasil nilai ulangan matematika "+nama);
        
    }
    static void data(int matematika){
        if(matematika >= 80){
            System.out.println(matematika +"Memenuhi nilai KKM");
            
        }else {
            System.out.println(matematika +"Tidak memenuhi nilai KKM");
        } 
    }
    public static void main(String args[] ){
        Scanner inputnama = new Scanner(System.in);
        
        
        System.out.println("Nama anda "+inputnama);
        String nama = inputnama.nextLine();
        namanya(nama);
        
        System.out.print("Masukkan nilai ulangan matematika ");
        
        Scanner input = new Scanner(System.in);
        int matematika= input.nextInt();
        data(matematika);
        
       
    }
}   
