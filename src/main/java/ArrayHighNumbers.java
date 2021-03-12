/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ArrayHighNumbers {
    
    public static void main(String[] args) {
        int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int greaternumber = 6;
        System.out.println(count(number, greaternumber ));
       
    }
    public static int count(int[] x, int n){
        int count = 0;
        for(int i=0; i<x.length; i++){
            if(x[i]>n ){
                count++;
                
            }
            
        }
        return count;
    }  
}
