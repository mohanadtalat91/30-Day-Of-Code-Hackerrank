import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myVar = new Scanner(System.in);
        int num = myVar.nextInt() ; 
        num += 4 ; 
        double num_double = myVar.nextDouble() ; 
        num_double += 4.0 ;
        myVar.nextLine() ;
        String str = myVar.nextLine();
        System.out.println(num); 
        System.out.println(num_double) ; 
        System.out.println("HackerRank"+" "+ str) ;
    }
}
