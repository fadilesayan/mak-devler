

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
public class week11ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           int A []={14,85,74,52,96,47};

                
        siralama(A);
        
        
      
               
    }
    public static int siralama(int []B){
     
     int temp;
        for (int i = 0; i <B.length; i++) {
            for (int j = i+1; j <B.length; j++) {
                if(B[j]<B[i])         {
                temp=B[i];
                B[i]=B[j];
                B[j]=temp; 
                }
                
                
            }
            System.out.println(B[i]);
            
        }
       return 0;
               
       
  
        
      
    }
    
    
    
}
