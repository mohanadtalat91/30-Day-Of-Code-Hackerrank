import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;  
        int [][] arr = new int[6][6] ; 
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                int num = input.nextInt() ;
                arr[i][j] = num ;  
            }
        }
        int myMax = Integer.MIN_VALUE ; 
        for(int i=3; i>=0; i--){
            for(int j=3; j>=0; j--){
                int sum = 0 ; 
                sum += arr[i][j]+arr[i][j+1]+arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]; 
                myMax = Math.max(myMax,sum) ; 
            }
        }
        System.out.println(myMax) ; 
        
    }
}
