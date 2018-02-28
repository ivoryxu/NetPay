/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netpay;

/**
 *
 * @author user
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n,w,h,i,t;
        
        w=40;
        h=5;
        i=2;
        t=0.22;
        
         n=(h*w-i)-t*(h*w-i);
         
         System.out.println("The net pay is "+n+" dollars");
    }
    
    
    
}
