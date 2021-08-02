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
public class Presensi14 {
    public static void main (String[] args){
        
         Scanner input = new Scanner(System.in);
         
         String nama, akrab, lahir, kota, smp, hobi, motivasi, prestasi;
         
         System.out.print("Nama Lengkap : ");
         nama = input.nextLine();
         
         System.out.print("Nama Akrab : " );
         akrab = input.nextLine();
         
         System.out.print("Tempat,Tanggal Lahir :");
         lahir = input.nextLine();
         
         System.out.print("Asal Kota :");
         kota = input.nextLine();
         
         System.out.print("Asal SMP :");
         smp = input.nextLine();
         
         System.out.print("Hobi :");
         hobi = input.nextLine();
         
         System.out.print("Motivasi dalam hidup :");
         motivasi = input.nextLine();
         
         System.out.print("Prestasi :");
         prestasi = input.nextLine();
         
          System.out.println ("=====Biodata Saya=====");
          System.out.println("Nama Lengkap : "+nama);
          System.out.println("Nama Akrab : "+akrab);
          System.out.println("Tempat,Tanggal Lahir : "+lahir);
          System.out.println("Azal kota : "+kota);
          System.out.println("Asal SMP : "+smp);
          System.out.println("Hobi : "+hobi);
          System.out.println("Motivasi dalam Hidup : "+motivasi);
          System.out.println("Prestasi : "+prestasi);          
         
         System.out.println("=====Terima Kasih Telah Mengisi Biodata=====");
               
        
    }
    
}
