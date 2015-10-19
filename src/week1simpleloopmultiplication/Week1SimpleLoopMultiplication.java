/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week1simpleloopmultiplication;

/**
 *
 * @author Eugene OR
 */
public class Week1SimpleLoopMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int totalSum = 0, multi = 5;
     int num = 2;
     int counter =-5;
     /*
     The next few lines is a do ... while loop
     */
     do{
         totalSum = totalSum + num;
         counter++;
     }while (counter <= multi);
     
        System.out.println(totalSum);
        
        
    } // End of main 
    
}// End of class
