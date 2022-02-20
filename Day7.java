import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in) ; 
        int n = input.nextInt() ;

        

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int item = input.nextInt() ;
            arr.add(item) ;
        }
        
        for( int j =n-1 ; j >= 0 ; j--){
            System.out.print(arr.get(j) + " ") ; 
        }

    }
}
