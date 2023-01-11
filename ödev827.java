
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
public class ödev827 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen NxN tipindeki ifadeyi giriniz");
        int n=input.nextInt();
        int A[][]=new int [n][n];
        int B [][][]=new int[n][n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(i+"inci satır"+j+"inci sutun");
                A[i][j]=input.nextInt();
                
                
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][i][j]=A[i][j];
                
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-1; j++) {
                for (int k = j+1; k <n; k++) {
                    if (B[i][i][k]<B[i][i][j]) {
                        int f=B[i][i][j];
                        B[i][i][j]=B[i][i][k];
                        B[i][i][k]=f;
                        
                        
                        
                    }
                    
                }
                
            }
            
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(B[i][i][j]+" ");
                
            }
            
        }
    }
    
}
