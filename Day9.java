import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner ; 
class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        if( n == 0 ){
            return 1 ; 
        }
        
        return n*factorial(n-1) ; 

    }

}

public class Solution {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in) ; 
        int n = input.nextInt() ; 
        
        int result = Result.factorial(n);

        System.out.println(result) ; 
        input.close() ; 
    }
}
