/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**rastgele girilen bir kelimenin harflerinin büyüklüklerinin tersini alarak(büyükse küçük küçükse büyük)yazdıran program
 *
 *
 * @author computer
 */ 
import java.util.Scanner;


public class week9ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length(); i++) {
            if ((txt.charAt(i))>=65&&(txt.charAt(i))<=90) {
                System.out.print((char)(txt.charAt(i)+32));
                
            }else{
                System.out.print((char)(txt.charAt(i)-32));
            }
                
            
        }
     
        
        
        
    }
    
}
