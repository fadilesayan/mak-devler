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

public class ödev818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen NxN değerini giriniz");
        int n=input.nextInt();
        int A[][]=new int[n][n];
        int B [][]=new int[n][n];
        System.out.println("A matrisi");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                A[i][j]=input.nextInt();
                System.out.println(i+"inci satır"+j+"inci sutun");
            }
            System.out.println();
           
            
        }
        System.out.println("B matrisi");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (j>i) {
                  B[i][j]=0;  
                  
                }
              else {
                    B[i][j]=A[i][j];
                    
                    
                }
                
                System.out.print(B[i][j]);
            }
            System.out.println();
            
        }
        
    }
    

}
