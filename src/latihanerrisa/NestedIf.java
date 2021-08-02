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
public class NestedIf {
    public static void main (String[] args){
         int a = 10;
         int b = 15;
         int c = 23;
         
         System.out.println("Ini adalah awal program");
         
    if(a == 10){
        if(b == 15){
            System.out.println("Ini jika a dan b nya benar");
        }else{
            if(c == 23){
                System.out.println("Ini jika a benar dan b salah");
                
            }else{
                System.out.println("ini jika a benar dan b c salahh");
            }
        }
    }else{
        System.out.println("Ini jika a b c salah");
    }
    System.out.println("Ini adalah akhir program");
    }
}
