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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> ans = new ArrayList<String>() ; 
        Pattern pattern = Pattern.compile("@gmail.com") ; 

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                Matcher matcher = pattern.matcher(emailID) ;
                boolean found = matcher.find() ; 
                
                if(found){
                    ans.add(firstName) ; 
                } 
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        bufferedReader.close();
        
        Collections.sort(ans) ; 
        
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
