/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;
import java.util.Scanner;


public class PRIMENUMBER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
          int N=in.nextInt();
          int count=0;
          for(int i=1;i<=N;i++)
          {
              if(N%i==0)
                count++;
           } 
          if(count==2)
          {
              System.out.println("yes");
          }
          else
          {
              System.out.println("no");
          }
                  
        }
    }
    
}
