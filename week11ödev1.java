
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
public class week11ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı girniz");
        int x=input.nextInt();
        toplam(x);
        
        
        
    }
    public static int toplam(int x){
        int toplam=0;
        
        for (int i = 1; i <=x; i++) {
            toplam+=Math.pow(i,2);
            
            
            
        }
        System.out.println("Toplam:"+toplam);
        return x;
        
        
    }
    
}
