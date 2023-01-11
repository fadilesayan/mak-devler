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
import java.util.Random;

public class week11ödev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner input=new Scanner(System.in);
        int N=input.nextInt();
     
        
        
     
       
     int []randomsayilar=randomarray(150,N);
        for (int i = 0; i < randomsayilar.length; i++) 
        {
            System.out.print(randomsayilar[i]+", ");
        }
     
    }
    public static int[] randomarray(int ub,int N)
    {
        int [] array=new int[N];
        Random r=new Random();
        for (int i = 0; i <array.length; i++) 
        {
            array[i]=r.nextInt(ub);
        }
        return array;
        
    }
    
}
