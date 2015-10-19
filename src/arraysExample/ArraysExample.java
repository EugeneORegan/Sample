/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraysExample;
import java.util.Arrays; // Import used to bring in Arrays class functionality
/**
 *
 * @author Eugene OR
 */
public class ArraysExample {
/*
    Simple arrays
    This was originally named Arrays but due to conflict with
    existing Arrays class, renamed ArraysExample
    */
    
    public static void main(String[] args) {
        int oddNos[] = new int [10]; // Declaring an array of ints capable of storing 10 ints
        int x = 0; // This will be used in the loading of the array
        /*
        We are now going to use a for loop to load the array
        with all the odd #s from 1 to 20 inclusive
        */
        for(int i = 1;i<=20;i++)
        {
            if(i%2 != 0) // This will only allow #s that are odd into the if
            {
               // System.out.println(i);
                oddNos[x] = i; // Loading the array with the number
                x++; // Move the index up 1
              }
        }
        /*
        Next line uses the Arrays class to print the 
        contents of the array
        */
        System.out.println(Arrays.toString(oddNos));
        // Next line is just to demonstrate that we can change the 
        // value of an individual array space
        oddNos[0] = 25;
        // Next for loop is just used to print contents of the array
        for(int o = 0; o <oddNos.length ; o++)
        {
        System.out.println(oddNos[o]);
        }
    }// End of main
    /*
    Useful Links 
    http://stackoverflow.com/questions/5570882/how-to-use-java-util-arrays
    */
}// End of class
