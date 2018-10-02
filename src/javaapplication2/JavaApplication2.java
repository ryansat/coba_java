/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author ASUS
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int bilangan1 = 10;
        int bilangan2 = 30;
        System.out.println(bilangan1+bilangan2);
    
        if (bilangan1+bilangan2>30)
        {
            System.out.println("bilangan1+bilangan2 > 30");
       }
        
        for (;bilangan1 <15;)
        {
             System.out.println(bilangan1);
             bilangan1 = bilangan1+2;
        }
    }
    
}
