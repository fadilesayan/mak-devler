
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
public class ödev8272 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen NXN tipindeki ifadeyi giriniz");
        int n=input.nextInt();
        int A[][]=new int [n][n];
        int B[]=new int [n];
        int temp;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(i+"inci satır "+j+"inci sutun");
                A[i][j]=input.nextInt();
                
                
            }
            for (int j = 0; j <n; j++) {
                for (int k = 0; k <n; k++) {
                    B[i]=A[i][j];
                    if (B[i]<B[k]) {
                        temp=B[i];
                        B[i]=B[k];
                        B[k]=temp;
                        System.out.print(B[i]);
                                                

                    }
                    
                }
                
            }
            
        }
        
    }
    
}
