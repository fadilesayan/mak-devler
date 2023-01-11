
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
public class ödev821 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir NxN matrisi değeri giriniz");
        int n=input.nextInt();
        int A[][]=new int [n][n];
        int B[]=new int [n];
        System.out.println("A matrisi");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                A[i][j]=input.nextInt();
                System.out.println(i+"inci satır"+j+"inci sutun");
            }
           
            
        }
        System.out.println("B matrisi");
        for (int i = 0; i <n; i++) {
            int  carpım=1;
          
           for (int j = 0; j <n; j++) {
              carpım*=A[j][i];
               
               
               
            }
          B[i]=carpım;
            System.out.println(B[i]);

            
            
                
              
           
            
        }
      
        
    }
}