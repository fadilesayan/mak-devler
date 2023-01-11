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

public class ödev816 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen NxN ifadesini giriniz");
        int n=input.nextInt();
        int A[][]=new int [n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(i+"inci satır"+j+"inci sutun");
                    A[i][j]=input.nextInt();
                    
                
            }
            
        }
        int T=0;//TOPLAM
        for (int i = 0; i <n-1; i++) {
            T+=A[i][n-1]+A[n-1][i];
            
            
        }
        System.out.println(T-A[n-1][n-1]);
        
                
      
    }
    
}
