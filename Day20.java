import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections ; 


public class Solution {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in) ; 
        int n = input.nextInt() ; 
        int counterOfInversion = 0 ; 
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = input.nextInt() ;
            arr.add(aItem);
        }

        for( int i=0 ; i<n ; i++ ){
            for(int j=0 ; j<n-1 ; j++){
                if( arr.get(j) > arr.get(j+1)){
                    Collections.swap(arr,j,j+1) ;
                    counterOfInversion++ ;  
                }
            }
        }
        
        System.out.println("Array is sorted in " + counterOfInversion + " swaps.") ; 
        System.out.println("First Element: " + arr.get(0)) ; 
        System.out.println("Last Element: " + arr.get(n-1)) ; 
        
        
        input.close() ; 
    }
}
