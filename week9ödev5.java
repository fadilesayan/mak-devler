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
public class week9ödev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String txt=input.nextLine();
        int  n=txt.length()/2;
        
        for (int i = 1; i <n; i++) {
            System.out.print(txt.charAt(+i)+","+txt.charAt(n-1-i));
            
        }
    }
    
}
