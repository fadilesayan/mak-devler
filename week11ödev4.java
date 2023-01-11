
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
public class week11ödev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
      System.out.println("Lütfen satır sayısı giriniz");
        int satır=input.nextInt();
        System.out.println("Lütfen bir sütün sayısı girniz");
        int sutun=input.nextInt();
        int A[][]=new int[satır][sutun];
        int B[][]=new int [satır][sutun];
        System.out.println("A matrisi:");
        for (int i = 0; i <satır; i++) {
            for (int j = 0; j <sutun; j++) {
                System.out.print(i+"inci satır ve"+j+"inci sutun");
                A[i][j]=input.nextInt();
                
            }
            System.out.println();
        }
         System.out.println("B matrisi:");
        for (int i = 0; i <satır; i++) {
            for (int j = 0; j <sutun; j++) {
                System.out.print(i+"inci satır ve"+j+"inci sutun");
                B[i][j]=input.nextInt();
                
        
    
    
        
        
        }
            System.out.println();
            dizitoplam(A,B);
            
    
    
}
    }
    public static void dizitoplam(int A[][],int B[][]){
        int C[][]=new int [A.length][A.length];
        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j <B.length; j++) {
                C[i][j]=A[i][j]+B[i][j];
                
                
            }
                
                
            
        }
        
        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j <B.length; j++) {
                System.out.print(C[i][j]);
                
                
            }
            System.out.println();
            
        }
        
        
        
    }
        
    
}

    
