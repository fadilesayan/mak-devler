
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
public class week11ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz  ");
        int n=input.nextInt();
        asalmi(n);
        
        
    }
    
    public static int  asalmi(int x){
        boolean asalmi=true;
        
        for (int i = 2; i <x; i++) {
            if (x%i==0) {
                asalmi=false;
                
                
                
                
            }
        }
        
            if (asalmi==true&&x!=1) {
                System.out.println("Asaldır");
                
            }
            else{
                System.out.println("Asal değildir");
            }
           
            
            
        
        return x;
           
        
        
        
        
        
        
        
        
        
        
        
     
        
    }
    
}
