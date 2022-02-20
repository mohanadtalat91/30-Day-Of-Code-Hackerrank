import java.io.*;
import java.util.*;

public class Solution {

    static void sol( String str){
        
            String odd = "", even = "" ; 
            for( int j=0 ; j<str.length() ; j++ ){
                if( j%2 == 0 ){
                    even += str.charAt(j) ; 
                }
                else{
                    odd += str.charAt(j) ; 
                }
            }
            System.out.println(even + " " + odd) ; 
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in) ; 
        
        int t = input.nextInt() ;
        String str ;  
        
        for( int i=0 ; i<t ; i++ ){
            
            str = input.next() ; 
            sol(str) ; 
        }
    }
}
