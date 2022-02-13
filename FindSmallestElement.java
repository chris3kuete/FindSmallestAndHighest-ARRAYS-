
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmallestelement;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class FindSmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        double[] arr = new double[10];
        
        System.out.println("Enter 10 numbers ");
        for (int i = 0; i < 10; i++) {
            arr[i]= scan.nextInt();
            
        }
        double m =smallest(arr);
        System.out.println("the smallest number is: "+ m);
        double n = highest(arr);
        System.out.println("The highest number is "+ n);
    }
    public static double smallest(double[] array){
        
       double min= array[5];
       
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min=array[i];
            }
            
        }
         return min;   
    }
    
    public static double highest(double[] array){
        double max = array[9];
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
       return max; 
    }
    
}
