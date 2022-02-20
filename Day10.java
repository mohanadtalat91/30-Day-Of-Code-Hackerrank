import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner ; 
import java.util.ArrayList ; 


public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ; 

        int n = input.nextInt() ;
        ArrayList<Integer> ones_zeros = new ArrayList<Integer>() ; 
        while(n != 0){
            int reminder = n%2 ; 
            ones_zeros.add(reminder) ; 
            n = n/2 ; 
        }
        int my_max = 0 , sequenceOfOnes = 0 ; 
        for( int i : ones_zeros ){
            if( i == 1 )sequenceOfOnes++ ; 
            else if( i == 0 ){
                if(my_max < sequenceOfOnes){
                    my_max = sequenceOfOnes ; 
                }
                sequenceOfOnes = 0 ; 
            }
        }
        if(my_max < sequenceOfOnes){
                    my_max = sequenceOfOnes ; 
        }
        System.out.println(my_max) ; 

        input.close() ; 
    }
}
