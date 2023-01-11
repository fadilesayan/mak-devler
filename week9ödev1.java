/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import java.util.*;
public class week9ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String txt=input.nextLine();
        Random r=new Random();
        int a=r.nextInt(txt.length());
        
        for (int i = 0; i <txt.length(); i++) {
            if (a%2==0) {
               System.out.println(Character.toUpperCase(txt.charAt(i)));
                
            }
            else{
                System.out.println(Character.toLowerCase(txt.charAt(i)));
            }
            
            
        }
                
                
        
       
    }
    
}
