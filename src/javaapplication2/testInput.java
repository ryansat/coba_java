/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class testInput {
    public static void main(String[] test12){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Masuuka Nilai"));
        System.out.println("Bilangan prima 1-N");
     
        int j=1;
        int i=2;
        for (;i<=a;i++)
        {
            int b = 0;
            j = 1;
            for (;j<=i;j++)
            {
                if(i%j == 0)
                {
                    b=b+1;
                }else{
               
                }
            }
            if(b<=2)
            {
            System.out.println(i);
            }
        }
        
        System.out.println("Bilangan Fibonacci sejumlah N-1");
        
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        int t = 1;
        for (;t<a;t++)
        {
        System.out.println(f3);
        f3 = f1+f2;
        f1=f2;
        f2=f3;
        }
        
        
    }
    
}
