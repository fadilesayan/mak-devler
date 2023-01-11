
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
public class ödev823 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen NXN tipindeki ifadeyi giriniz");
        int n=input.nextInt();
        int A[][]=new int [n][n];
        
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(i+"ıncı satır"+j+"inci sutun");
                A[i][j]=input.nextInt();
                
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                 if (A[i][j]==A[j][i]) {
                     System.out.println("Simetriktir");
                }
                 else{
                     System.out.println("Simetrik değildir");
                 }
              
                
            }
         
            
        }
        
                
                
                
                
    }
    
}
