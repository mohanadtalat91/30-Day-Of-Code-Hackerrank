import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in) ; 
        int Dreturn = scan.nextInt(), Mreturn = scan.nextInt(), Yreturn = scan.nextInt();
        int DDue = scan.nextInt(), MDue = scan.nextInt(), YDue = scan.nextInt();
        int fine ; 
        if(Yreturn < YDue){
            fine = 0 ; 
        }
        else if( Yreturn > YDue){
            fine = 10000 ; 
        }
        else{
            if(Mreturn < MDue){
                fine = 0 ; 
            }
            else if(Mreturn > MDue){
                fine = Mreturn - MDue ; 
                fine *= 500 ; 
            }
            else{
                if(Dreturn > DDue){
                    fine = Dreturn - DDue ; 
                    fine *= 15 ; 
                }
                else{
                    fine = 0 ; 
                }
            }
        }
        
        System.out.println(fine) ; 

    }
}
