import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in) ;
        int t = scan.nextInt() ; 
        while(true){
            if(t==0){
                break ; 
            }
            t-- ; 
            boolean flag = true ; 
            int n = scan.nextInt() ; 
            if(n<=1){
                flag = false ; 
            }
            for(int i=2 ; i*i<=n; i++){
                if( n % i == 0 ){
                    flag = false ; 
                    break ; 
                }
            }
            if(flag){
                System.out.println("Prime") ; 
            }
            else{
                System.out.println("Not prime") ; 
            }
        } 
    }
}
