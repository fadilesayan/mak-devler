/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class week9ödev7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
           Scanner inp = new Scanner(System.in);
        String cümle = inp.nextLine();
        String a="";
        int s=cümle.length();

        for (int i = 0; i < s/2; i++) 
        {
            a+=cümle.charAt(i);
            a+=cümle.charAt(s-i-1);
        }
        System.out.println(a);
        String b ="";
        for (int i = a.length()-1; i >=0; i--) 
        {
            b+=a.charAt(i);
        }
        System.out.println(b);
    }
    
}
